package Question3;

// The send mehod can be made abstract.. Like the validator example once seen
public class EmailSender 
{
	public void SendEmail(String emailAddress, String subject, String message)
	{
		// I'm pretending to send an email!
		System.out.println("To: " + emailAddress);
		System.out.println("Subject: " + subject);
		System.out.println("Message: \n\n" + message);
	}

    
}