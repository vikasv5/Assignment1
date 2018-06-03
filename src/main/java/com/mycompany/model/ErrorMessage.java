/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vikas
 */
@XmlRootElement
public class ErrorMessage {
    
    private String Message;
    private int errorCode;
    private String documentation;

    public ErrorMessage(String Message, int errorCode, String documentation) {
        this.Message = Message;
        this.errorCode = errorCode;
        this.documentation = documentation;
    }

    public ErrorMessage() {
    }
    
    
    
    
    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }
        
}
