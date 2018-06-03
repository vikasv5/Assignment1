/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.database;

import com.mycompany.model.Dealer;
import com.mycompany.model.Order;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Vikas
 */
public class DatabaseClass {
    
//    private static Map<Long, Message> messages=new HashMap();
//private static Map<String, Profile> profiles=new HashMap();
    private static Map<Long, Order> orders=new HashMap();
    private static Map<String, Dealer> dealers=new HashMap();

//    public static Map<Long, Message> getMessages() {
//        return messages;
//    }

//    public static Map<String, Profile> getProfiles() {
//        return profiles;
//    }
    
    public static Map<Long, Order> getOrders() {
        return orders;
    }
    
    public static Map<String, Dealer> getDealers() {
        return dealers;
    }
    
    
}
