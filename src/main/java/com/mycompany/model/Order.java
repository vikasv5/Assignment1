/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

/**
 *
 * @author Vikas
 */
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement (name = "order")
public class Order {
    
    long id;
String name;
Dealer dealer;   
DeliveryAddress deliveryaddress;

List<Item> item;

@XmlElementWrapper(name="items")

    public List<Item> getItemorder() {
        return item;
    }

    @XmlElement
    public void setItemorder(List<Item> itemorder) {
        this.item = itemorder;
    }

    public DeliveryAddress getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(DeliveryAddress deliveryaddress) {
        this.deliveryaddress = deliveryaddress;
    }

    
    
    public Dealer getDealer() {
        return dealer;
    }
@XmlElement
    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }
    
    public long getId() {
        return id;
    }

    @XmlElement
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
    
    
    public Order(){}
    public Order(int id, String name,Dealer dealer,DeliveryAddress deliveryaddress,List<Item> itemorder  ){
    this.id=id;
    this.name=name;
    this.dealer=dealer;    
    this.deliveryaddress=deliveryaddress;
    this.item=itemorder;
    }
    
}

















