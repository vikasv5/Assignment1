/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;
import javax.ws.rs.BadRequestException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vikas
 */
@XmlRootElement(name="order")
public class OrderError implements OrderMessage{
    
    String result;
    String error;
    String errormessage;

    public OrderError(String result, String error, String errormessage) {
        this.result = result;
        this.error = error;
        this.errormessage = errormessage;
    }

    public OrderError() {
    }
    
    

    public String getResult() {
        return result;
    }
@XmlElement
    public void setResult(String result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }
@XmlElement
    public void setError(String error) {
        this.error = error;
    }

    public String getErrormessage() {
        return errormessage;
    }
@XmlElement
    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }
    
}
