/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author caleb
 */
import Question1.HourlyWorker;
import Question1.SalaryWorker;
import Question1.Worker;
import Question1.Employer;
import Question2.Book;
import Question2.DVD;
import Question4.BankAccount;
import Question4.USDollarAccount;
import Question7.AquaticInsect;
import Question6.PiggyBackOperations;
import Question6.PiggyBank;
import Question7.FlyingInsect;
import java.util.ArrayList;
import java.util.List;
public class MainClass {
    
    public static void main(String[] args) {
        System.out.println("Hello World");

        
        
//        	ArrayList<Worker> hourlyWorkers = new ArrayList<Worker>();
//		for (int i = 0; i < 5; i++)
//		{
//			hourlyWorkers.add(new HourlyWorker());
//		}
//        	ArrayList<Worker> salaryWorkers = new ArrayList<Worker>();
//		for (int i = 0; i < 5; i++)
//		{
//			salaryWorkers.add(new SalaryWorker());
//		}

             
// Question 1
             Employer emp= new Employer();
             emp.outputWageCostsForAllStaff(13);
             
// Question 2             
        Book book = new Book();
        System.out.println(" "+book.GetAuthor());
        System.out.println(" "+book.GetTitle());
        System.out.println(" "+book.IsDigitalOnly());
        
        DVD dvd= new DVD();
        System.out.println(" "+dvd.GetTitle());
        System.out.println(" "+dvd.GetPlayTime().toMinutes());
        System.out.println(" "+dvd.GetCastList());
        
 
        
        //Question 4
             
             BankAccount bankAcct= new BankAccount();
             System.out.println(" bank balance"+bankAcct.GetBalance());
             
             bankAcct.Credit(100);
             bankAcct.Debit(20);
             System.out.println(" bank balance"+bankAcct.GetBalance());
             USDollarAccount dollarAccount= new USDollarAccount(bankAcct);
             System.out.println(" bank balance"+dollarAccount.GetBalance());
             
             dollarAccount.Credit(10);
             System.out.println(" bank balance"+dollarAccount.GetBalance());
             dollarAccount.Debit(10);
             System.out.println(" bank balance"+dollarAccount.GetBalance());
             
             
             
             
          // Question 6
          
             
                   PiggyBank pb = new PiggyBank();
            pb.AddDime();pb.AddDime();pb.AddDime();
            pb.AddQuarter();pb.AddQuarter();
            pb.AddPenny();pb.AddPenny();pb.AddPenny();pb.AddPenny();pb.AddPenny();pb.AddPenny();pb.AddPenny();pb.AddPenny();pb.AddPenny();
            pb.AddNickel();pb.AddPenny();pb.AddPenny();pb.AddPenny();
            
            PiggyBackOperations pOps= new PiggyBackOperations();
            pOps.Save(pb);
                    PiggyBank newPb=pOps.Load();

             System.out.println(" "+ newPb.toString()+" "+ " "+ " "+ " " );
             
             
        // Question 7     
       AquaticInsect aIns=  new AquaticInsect();
       aIns.Swim();
       aIns.MoveAntennae();
      
       
        FlyingInsect fIns= new FlyingInsect();
        fIns.Fly();
        fIns.MoveAntennae();
        
        
         
    }
    
}
