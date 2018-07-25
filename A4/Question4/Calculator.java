public class Calculator
{
	public static int Divide(int left,int right)
	{
		MathOperation op = new MathOperation(new Divide(), new Operand(left,right));
		return op.GetResult();
	}

	public static int Multiply(int left,int right)
	{
		MathOperation op = new MathOperation(new Multiply(),new Operand(left,right));
		return op.GetResult();
	}

	public static int Add(int left,int right)
	{
		MathOperation op = new MathOperation(new Add(), new Operand(left,right));
		return op.GetResult();
	}

	public static int Subtract(int left,int right)
	{
		
                MathOperation op = new MathOperation(new Subtract(),new Operand(left,right));
		return op.GetResult();
                
	}
        
        
}
