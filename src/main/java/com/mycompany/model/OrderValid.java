/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;




/**
 *
 * @author Vikas
 */
@XmlRootElement(name="order")
public class OrderValid implements OrderMessage{

    
    public OrderValid(){}

    public OrderValid(String succeded) {
        this.succeded = succeded;
    }
    
    
    
String succeded;

List<Item> items;
@XmlElement
    public List<Item> getItem() {
        return items;
    }

    public void setItem(List<Item> item) {
        this.items = item;
    }

    public String getSucceded() {
        return succeded;
    }
@XmlElement
    public void setSucceded(String succeded) {
        this.succeded = succeded;
    }

    
    
    
}
