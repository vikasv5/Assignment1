Please Run the MainClass in the package Main to test the functionality and implementaton of the code. 

Question1
Principle Violated: DEPENDENCY INVERSION PRINCIPLE

a. Why:

i. The high level class Employer depends on the low level classes HourlyWorker and SalaryWorker, if we added more worker types or more methods in the Employer class we’d have to do a lot of work in the Employer class.

b. Solution:


I have used factory pattern to create the workers for the Employer class. This way Employer class is not directly dependent on concrete implementations of the class. 

I have also added an interface(Worker) which has the method calculatePay(hours), which 
HourlyWorker and SalaryWorker implement. 

The high level class Employer should depend on an interface with a calculatePay(hours) method. Then each class (HourlyWorker, SalaryWorker, any new worker types) should implement that interface.Two loops containing single array of workers is used to create 
and add workers to the single Array of type worker. 



Question2
why:
a. Interface segregation principle  is Violated. This is because the Book and the DVD class have methods they do not really need but are forced to implement them by ILibraryItem. 

Solution: To solve the problem I have removed the methods specific to DVD or Book from the ILibraryItem interface.I then added two new interfaces called INoteBook containing GetAuthor() method and IDisc containing GetCastList() and GetPlayTime() methods.
Both these interfaces extend ILibraryItem interface which has GetTitle() and IsDigitalOnly() methods. 
This way we can make sure that both the Library Items need not be running methods which are not relevant to their respective classes.



Question 3:

Why: The ProfitReport Violates single responsiblity principle.The report should be mainly concerned with report being generated and not sending the report to email or printer. 

Solution: Initially I wanted to remove the code for sending out the report into some reportingOperation class. But I think Solution that I chose is good enough as code does not need to  be modified in the reporting class. I introduced a service interface with a send method. I put all the logic for Email into EmailSvc class which extends the Service class and PrintSvc class which also extends Service class. Now, when ever send method is called by sending a particular service as an argument, the service handles the responsibility of handling and operating the Report data as it is implemented. IE the ProfitReport class is
not responsible for it.


Question 4:
Why: USDollarAccount Violates the Open/Closed principle, since it is effectively overriding the logic of its parent class and makes for a very ineffective design.

Solution: I have used Decorater Design Pattern  to solve the problem here. I created a account interface with all the method names(Debit,Credit,showBalance) which the BankAccount implements. This Account Interface is used as Variable in USDollarAccount class which takes any class implementing account as argument in the constructor. Then 3 methods is put in the 
USDollarAccount class run on the account interface variable(any class implementing the account interface). 


Question 5:

Why: CountryGDPReport violates depedency inversion principle as it depends on the concrete implementation of low level class details.

Solution: To solve the problem I have created 3 basic interfaces called Agriculture, Tourism and Manufacturing. Additional two interfaces AgrAndTourism and AgrManufacturing are created which implement Agriculture and Tourism, and Agriculture and Manufacturing respectively. Mexico and Canada implement these respective interfaces. I have also added factory pattern to create concrete instances of Mexico and Canada classes so that CountryGDPReport is not responsible for creating these concrete implementations.

Question 6:
Why: Single responsibility principle 
PiggyBank Load and Save Method Violate Single responsibility principle  as they do not have to be concerned with those partcular operations
Solution:Load and Save methods are moved to PiggyBackOperations class where Piggybank Object is provided to save method to save it into a text file. The load method in PiggyBackOperations class reads the file and returns the Piggybank Object.



Question 7:

Why:Violates Interface Segregation Principle. The Aquatic Insect and Flying Insect are forced to implement Fly() and Swim() methods respectively by Insect Class which has nothing to do with their functionality.

Solution: To solve this problem I created Iswim and IFly interfaces which have swim() and fly() methods respectively. These methods are taken out of Insect Class. Not Insect class has only MoveAntennae() method. Now Aquatic fly implements Insect and Iswim interfaces and Flying Insect implements IFly and IInsect interfaces and thus not having any methods they do not need to implement.









