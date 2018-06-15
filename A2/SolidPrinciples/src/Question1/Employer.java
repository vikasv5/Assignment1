package Question1;
import java.util.ArrayList;

public class Employer
{
	ArrayList<Worker> hWorkers;
	ArrayList<Worker> sWorkers;

	public Employer()
	{
            //ArrayList<Worker> hourWorkers,ArrayList<Worker> salWorkers;
		
               hWorkers = new ArrayList<Worker>();
		for (int i = 0; i < 5; i++)
		{
			hWorkers.add(WorkerFactory.createHourlyWorker());
		}
              sWorkers = new ArrayList<Worker>();
		
		for (int i = 0; i < 5; i++)
		{
			sWorkers.add(WorkerFactory.createSalaryWorker());
		}
            
            
	}

    

	public void outputWageCostsForAllStaff(int hours)
	{
		float cost = 0.0f;
		for (int i = 0; i < hWorkers.size(); i++)
		{
			Worker worker = hWorkers.get(i);
			cost += worker.calculatePay(hours);
		}
		for (int i = 0; i < sWorkers.size(); i++)
		{
			Worker worker = sWorkers.get(i);
			cost += worker.calculatePay(hours);
		}
		System.out.println("Total wage cost for all staff = $" + cost);
	}
}