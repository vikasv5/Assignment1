package com.mycompany.samplewebserviceapp;



import com.mycompany.model.Order;
import com.mycompany.model.OrderError;
import com.mycompany.model.OrderMessage;
import com.mycompany.model.OrderValid;

import com.mycompany.service.OrderService;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vikas
 */
@Path("/orders")
public class orderResource {
    //MessageService service= new MessageService();
    OrderService orderService= new OrderService();
    
    
    @GET
    
    @Produces(value={MediaType.APPLICATION_XML,MediaType.TEXT_XML})
    public List<Order> getMessages(){
        return orderService.getAllOrders();
    }
    
    
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Response addMessage(Order order) throws URISyntaxException{
        OrderMessage orderMsg= orderService.processOrder(order);
        if(orderMsg.getClass().equals(OrderValid.class))
        {
        orderService.addOrder(order);
        }
    //OrderError error= new OrderError("failure","not authorized", null);
    return Response.accepted().entity(orderMsg).build();
    }
    
    
    
    
    
    @PUT
    @Path("{orderId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Order updateOrder(@PathParam("orderId") long id,Order order){
        order.setId(id);
    return orderService.updateOrder(order);
    }
    
    
    @GET
    @Path("{orderId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Order getTestString(@PathParam("orderId") long id){
    return orderService.getOrder(id);
    }
    
   
        
    
}
