/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author jabez.vejendla
 */
public class WorkerFactory {

public static Worker createHourlyWorker(){

    return new HourlyWorker();
    
    
}

public static Worker createSalaryWorker(){
return new SalaryWorker();


}

    
}
