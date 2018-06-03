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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "deliveryaddress")
public class DeliveryAddress {
    
    String name;
    String street;
    String city;
    String province;
    String postalcode;
    
    public DeliveryAddress(){}

    public DeliveryAddress(String name, String street, String city, String province, String postalcode) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.province = province;
        this.postalcode = postalcode;
    }
    

    
    
    public String getName() {
        return name;
    }
@XmlElement
    public void setName(String name) {
        this.name = name;
    }


    public String getStreet() {
        return street;
    }
@XmlElement
    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }
@XmlElement
    public void setCity(String city) {
        this.city = city;
    }


    public String getProvince() {
        return province;
    }
@XmlElement
    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalcode() {
        return postalcode;
    }
@XmlElement
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }
    
    public boolean isValidDeliveryAddress(){
    
    if(this.city==null|| this.name==null || this.postalcode==null
            || this.province==null || this.street==null||
            this.city.equals("") || this.name.equals("") || this.postalcode.equals("")
            || this.province.equals("") || this.street.equals("")
            )
    {return false;}
    else 
        return true;
    }
    
}
