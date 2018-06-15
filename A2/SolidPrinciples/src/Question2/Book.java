package Question2;
import java.time.Duration;
import java.util.ArrayList;

public class Book implements INoteBook
{
	

	public String GetAuthor()
	{
		return "Hemingway";
	}

	public String GetTitle()
	{
		return "For Whom The Bell Tolls";
	}

	public boolean IsDigitalOnly()
	{
		return false;
	}

	
}