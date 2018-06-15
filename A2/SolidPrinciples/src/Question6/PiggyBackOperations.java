/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Vikas
 */
public class PiggyBackOperations {
 public void Save(PiggyBank pb)
	{
		try
		{
			PrintWriter writer = new PrintWriter("piggybank.txt", "UTF-8");
			writer.println(Integer.toString(pb.numPennies));
			writer.println(Integer.toString(pb.numDimes));
			writer.println(Integer.toString(pb.numNickels));
			writer.println(Integer.toString(pb.numQuarters));
			writer.close();
		}
		catch (Exception e)
		{
			System.out.println("I am a bad programmer that hid an exception.");
		}
	}

	public PiggyBank Load( )
	{
		try
		{
			Scanner in = new Scanner(new FileReader("piggybank.txt"));
                        PiggyBank pb= new PiggyBank();
			pb.numPennies = Integer.parseInt(in.next());
			pb.numDimes = Integer.parseInt(in.next());
			pb.numNickels = Integer.parseInt(in.next());
			pb.numQuarters = Integer.parseInt(in.next());
                        return pb;
		}
		catch (Exception e)
		{
			
                    System.out.println("I am a bad programmer that hid an exception and return null.");
                    return null;    
		}
	}   
}
