/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.samplewebserviceapp;

/**
 *
 * @author Vikas
 * 
 */




import com.mycompany.model.Dealer;
import com.mycompany.model.Order;
import com.mycompany.model.OrderError;
import com.mycompany.model.OrderMessage;
import com.mycompany.service.DealerService;

import com.mycompany.service.OrderService;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
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
@Path("/dealerAdmin")
public class dealerResource {
    //MessageService service= new MessageService();
    OrderService orderService= new OrderService();
    DealerService dsvc= new DealerService();
    
    @GET
    
    @Produces(value={MediaType.APPLICATION_XML,MediaType.TEXT_XML})
    public List<Dealer> getMessages(){
        
        return dsvc.getAllDealersList();
        
        
    
    }
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Dealer addDealer(Dealer dealer) throws URISyntaxException{
        //OrderMessage orderMsg= orderService.processOrder(dealer);
      Map<String,Dealer> dMap=dsvc.getAllDealersMap();
      
      if(dMap.containsKey(dealer.getDealerId())){
      return dMap.get(dealer.getDealerId());
          
      }
    //OrderError error= new OrderError("failure","not authorized", null);
    dMap.put(dealer.getDealerId(),dealer);
    
    return dealer;
    }
    
    
//    @DELETE
//    @Consumes(MediaType.APPLICATION_XML)
//    @Produces(MediaType.APPLICATION_XML)
//    public Dealer removeDealer(Dealer dealer) throws URISyntaxException{
//        //OrderMessage orderMsg= orderService.processOrder(dealer);
//      Map<String,Dealer> dMap=dsvc.getAllDealersMap();
//      
//      if(dMap.containsKey(dealer.getDealerId())){
//      return dMap.get(dealer.getDealerId());
//          
//      }
//    //OrderError error= new OrderError("failure","not authorized", null);
//    dMap.put(dealer.getDealerId(),dealer);
//    
//    return dealer;
//    }
    
    
    
    
    
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
