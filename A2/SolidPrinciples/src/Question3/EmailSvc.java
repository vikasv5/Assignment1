/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Vikas
 */
public class EmailSvc implements Service{
    
    String emailAddress;
            
            public EmailSvc(String address){
            this.emailAddress=address;
                    
            }

    @Override
    public void send(String str) {
        		try
		{
	    	EmailSender sender = new EmailSender();
	    	sender.SendEmail(emailAddress, "Profit Report!", str);
		}
		catch (Exception e)
		{
			System.out.println("Yipes internet must be down!");
		}
        
        
    }
    
}
