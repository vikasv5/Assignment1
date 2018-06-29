
public class Main
{
	public static void main(String[] args)
	{
            //This code needs to be changed and not hard coded
            String str= "C:\\Users\\jabez.vejendla\\Documents\\NetBeansProjects\\SolidPrinciples\\src\\A3\\commands.txt";
            ///home/caleb/Desktop/Jabez/Assignment1/A2/SolidPrinciples/src/A3/commands.txt
		GameBoard.Instance().ProcessCommands(args[0]);
	}
}
