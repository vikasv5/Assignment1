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
import com.mycompany.model.Dealer;
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
public class DealerAccessTest {
    
    public DealerAccessTest() {
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
        //assertions for valid dealers
        Dealer dealer=  new Dealer("dealer1","access1");
        assertTrue(dealer.IsDealerAuthorized());
        
        dealer= new Dealer("dealer2","access2");
        assertTrue(dealer.IsDealerAuthorized());
        
        dealer= new Dealer("dealer3","access3");
        assertTrue(dealer.IsDealerAuthorized());
        
        //assertions for invalid dealers
        dealer= new Dealer("dealer3","inaccessble");
        assertTrue(!dealer.IsDealerAuthorized());
        dealer= new Dealer("notaDealer","access3");
        assertTrue(!dealer.IsDealerAuthorized());
        dealer= new Dealer("dealer2","access3");
        assertTrue(!dealer.IsDealerAuthorized());
        
    }
    
}
