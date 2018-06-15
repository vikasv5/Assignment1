package Question4;

//Using Decorater Design Pattern 
//Open closed principle
// Check logic for amount addition and deduction
public class USDollarAccount 
{
    static final float EXCHANGE_RATE = 0.75f;
    Account account;
    public USDollarAccount(Account a){
    account=a;
    }
    
    
	

	public void Credit(float amount)
	{
		
                account.Credit(  amount*EXCHANGE_RATE);
                
	}

	public void Debit(float amount)
	{
		
                account.Debit(amount * EXCHANGE_RATE);
	}
        
        public float GetBalance(){
        return account.GetBalance();
        }
        
        
}