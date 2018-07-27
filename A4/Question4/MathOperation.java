public abstract class MathOperation
{


	Operand operand;
	

	public MathOperation( Operand operand)
	{
		this.operand=operand;
	
	}

	public abstract int GetResult();
	
}
