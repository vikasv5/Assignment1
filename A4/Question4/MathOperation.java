public class MathOperation
{


	Operand operand;
	private OperationTypeInterface operationType;

	public MathOperation(OperationTypeInterface operationType, Operand operand)
	{
		this.operand=operand;
		this.operationType = operationType;
	}

	public int GetResult()
	{
		
		return operationType.GetResult(operand);
		
	}
}
