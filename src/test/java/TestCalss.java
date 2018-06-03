
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vikas
 */
public class TestCalss {
 
    public static void main(String[] args) {
        System.out.println("Hello there");
      
        try{testMethod();}
        catch(Exception e){System.out.println("Exception caught"+e);}
    }
    
    public static void testMethod() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
      Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
                      String host = "jdbc:derby://localhost:1527/sample";
                      String uname="app";
                      String passwd="app";
                       Connection con = DriverManager.getConnection(host, uname,passwd);
                       Statement st = con.createStatement();   
                     
                       String sql= "select * from testtable";
                       ResultSet rs=st.executeQuery(sql);
                       
                       while(rs.next())
                       {
                           System.out.println(" result set value "+rs.getInt(1));
                           System.out.println(" result set value "+rs.getString(2));
                       }
    
    }
    
    
    
}
