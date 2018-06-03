/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import com.mycompany.service.OrderService;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vikas
 */
@XmlRootElement(name = "dealer")
public class Dealer implements Security{
    
    String dealerId;
    String dealeraccesskey;
    
    public Dealer(){}
    
    public Dealer(String dealerId,String dealeraccesskey){
    this.dealerId=dealerId;
    this.dealeraccesskey=dealeraccesskey;
    }
    
        
    public String getDealerId() {
        return dealerId;
    }
@XmlElement
    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

        
    public String getDealeraccesskey() {
        return dealeraccesskey;
    }
@XmlElement
    public void setDealeraccesskey(String dealeraccesskey) {
        this.dealeraccesskey = dealeraccesskey;
    }

    public boolean  IsDealerAuthorized() {
        OrderService orders= new OrderService();
        List<Dealer> list=orders.getAllDealers();
        for(Dealer dealer: list){
        if(dealer.getDealerId().equals(this.dealerId) && dealer.getDealeraccesskey().equals(this.dealeraccesskey))
            return true;
            
        }
        return false;
        
    }
   
    
    
}
