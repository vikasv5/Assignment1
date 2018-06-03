/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.database.DatabaseClass;
import com.mycompany.model.Dealer;
import com.mycompany.model.DeliveryAddress;
import com.mycompany.model.Item;
import com.mycompany.model.Order;
import com.mycompany.model.OrderError;
import com.mycompany.model.OrderMessage;
import com.mycompany.model.OrderValid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 *
 * @author Vikas
 */
public class OrderService {

    private Map<Long, Order> orders = DatabaseClass.getOrders();

   

    public List<Dealer> dealers= new ArrayList<Dealer>();
     
  
    public OrderService() {
        
        Dealer d1= new Dealer("dealer1","access1");
        Dealer d2= new Dealer("dealer2","access2");
        Dealer d3= new Dealer("dealer3","access3");
        dealers.add(d1);
        dealers.add(d2);
        dealers.add(d3);
        
        DeliveryAddress address1=new DeliveryAddress("name1","st1","ct1","p1","po1");
        DeliveryAddress address2=new DeliveryAddress("name2","st2","ct2","p2","po2");
        DeliveryAddress address3=new DeliveryAddress("name3","st3","ct3","p3","po3");
       
        
        List<Item> itemorder= new ArrayList<Item>(); 
        
        Item i1= new Item(5,3);
        Item i2= new Item(11,9);
        Item i3= new Item(7,1);
        itemorder.add(i1);
        itemorder.add(i2);
        itemorder.add(i3);
        
        
        Order o1 = new Order(1, "Hello 1",d1,address1,itemorder);

        Order o2 = new Order(2, "Hello 3",d2,address2,null);
        Order o3 = new Order(3, "Hello 3",d3,address3,null);

        orders.put(1L, o1);
      //  orders.put(2L, o2);
       // orders.put(3L, o3);
    }

    public List<Order> getAllOrders() {
        return new ArrayList<Order>(orders.values());
    }

      public List<Dealer> getAllDealers() {
        return dealers;
    }
    
    
    public Order getOrder(Long id) {
        Order order = orders.get(id);
        if (order == null) {
            return null;
        } else {
            return order;
        }

    }

    public Order addOrder(Order order) {
        order.setId(orders.size() + 1L);
        orders.put(orders.size() + 1L, order);
        return order;
    }

    public Order updateOrder(Order order) {
        if (order.getId() <= 0) {
            return null;
        } else {
            orders.put(order.getId(), order);
            return order;
        }
    }

    public Order removeOrder(long id) {
        return orders.remove(id);
    }

    

    public List<Order> getMessagesPaginated(int start, int size) {
        List<Order> lms = new ArrayList<Order>(orders.values());
        if (start + size > lms.size()) {
            return lms.subList(start, lms.size());
        } else {
            return lms.subList(start, start + size);
        }

    }

    public OrderMessage processOrder(Order order) {
    Dealer dealer=order.getDealer();
    boolean dealerAuthorized=dealer.IsDealerAuthorized();
    DeliveryAddress address= order.getDeliveryaddress();
    boolean addressValid=address.isValidDeliveryAddress();
    //if(dealerAuthorized) return new OrderValid("Dealer is valid");
    if(!dealerAuthorized) return new OrderError("failure","not authorized", null);
      if(addressValid){
      OrderValid ordv=    new OrderValid("Dealer is valid"); 
      ordv.setItem(order.getItemorder());
          return ordv; 
      
      }  
      else {return new OrderError("failure","Invalid Order","Invalid Delivery Address");}
    }

}
