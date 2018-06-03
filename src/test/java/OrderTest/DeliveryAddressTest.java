/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderTest;

/**
 *
 * @author Vikas
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mycompany.model.DeliveryAddress;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Vikas
 */
public class DeliveryAddressTest {
    
    public DeliveryAddressTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of divide method, of class Division.
     */
    
    @Test
    
    public void testAddress() {
        DeliveryAddress address= new DeliveryAddress("name","street","city","province","postal");
        boolean isValid;
        isValid=address.isValidDeliveryAddress();
        // Address is Valid 
        assertTrue(isValid);
        
        address=new DeliveryAddress(null,"street","city","province","postal");
        isValid=address.isValidDeliveryAddress();
        assertTrue(!isValid);
        
        // TODO review the generated test code and remove the default call to fail.
        
        address= new DeliveryAddress("name",null,"city","province","postal");
        isValid=address.isValidDeliveryAddress();
        assertTrue(!isValid);
        
        
        address= new DeliveryAddress("name","street",null,null,"postal");
        isValid=address.isValidDeliveryAddress();
        assertTrue(!isValid);
        
        
        address= new DeliveryAddress("name","street","city","province",null);
        isValid=address.isValidDeliveryAddress();
        assertTrue(!isValid);
        
        address= new DeliveryAddress(null,"street","city","province",null);
        isValid=address.isValidDeliveryAddress();
        assertTrue(!isValid);
        
        
        
        address= new DeliveryAddress("name","street",null,null,null);
        
        isValid=address.isValidDeliveryAddress();
        assertTrue(!isValid);
        
        
        address= new DeliveryAddress("","street","city","province","");
        isValid=address.isValidDeliveryAddress();
        assertTrue(!isValid);
        
        address= new DeliveryAddress("name","","city","province","");
        isValid=address.isValidDeliveryAddress();
        assertTrue(!isValid);
        
        
        address= new DeliveryAddress("","","","","");
        
        isValid=address.isValidDeliveryAddress();
        assertTrue(!isValid);
        
        address= new DeliveryAddress("","street","","province","postal");
        
        isValid=address.isValidDeliveryAddress();
        assertTrue(!isValid);
        
        address= new DeliveryAddress("","street","","","postal");
        isValid=address.isValidDeliveryAddress();
        assertTrue(!isValid);
        
        
        
        
    }
    
}
