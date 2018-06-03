/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

/**
 *
 * @author Vikas
 */
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
public class DealerService {

    private Map<String, Dealer> dealers = DatabaseClass.getDealers();

   

    //public List<Dealer> dealers= new ArrayList<Dealer>();
     
  
    public DealerService() {
        
        Dealer d1= new Dealer("dealer1","access1");
        Dealer d2= new Dealer("dealer2","access2");
        Dealer d3= new Dealer("dealer3","access3");
        
        

        dealers.put(d1.getDealerId(), d1);
        dealers.put(d2.getDealerId(), d2);
        dealers.put(d3.getDealerId(), d3);
      //  orders.put(2L, o2);
       // orders.put(3L, o3);
    }

    public List<Dealer> getAllDealersList() {
        return new ArrayList<Dealer>(dealers.values());
    }

    public Map<String,Dealer> getAllDealersMap() {
        return dealers;
    }
      
    
    
    public Dealer getDealer(Long id) {
        Dealer dealer = dealers.get(id);
        if (dealer == null) {
        return null;
        } else {
            return dealer;
        }

    }

//    public Dealer addDealer(Dealer dealer) {
//        
//    }
//

//    public Dealer updateDealer(Dealer dealer) {
//    
//    }

    public Dealer removeDealer(long id) {
        return dealers.remove(id);
    }

    

   
    
}
