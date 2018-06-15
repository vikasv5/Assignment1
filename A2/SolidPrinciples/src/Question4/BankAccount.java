package Question4;
public class BankAccount implements Account
{
	protected float balance;
        
        public BankAccount(){
        balance=0f;
        }

	public float GetBalance()
	{
		return balance;
	}

	public void Credit(float amount)
	{
		balance += amount;
	}

	public void Debit(float amount)
	{
		balance -= amount;
	}
}