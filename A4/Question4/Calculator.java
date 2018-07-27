public class Calculator
{
	public static int Divide(int left,int right)
	{
		MathOperation op = new Divide( new Operand(left,right));
		return op.GetResult();
	}

	public static int Multiply(int left,int right)
	{
		MathOperation op = new Multiply(new Operand(left,right));
		return op.GetResult();
	}

	public static int Add(int left,int right)
	{
		MathOperation op = new Add(new Operand(left,right));
		return op.GetResult();
	}

	public static int Subtract(int left,int right)
	{
		
                MathOperation op = new Subtract(new Operand(left,right));
		return op.GetResult();
                
	}
        
        
}
