public class Add extends MathOperation{
    public Add(Operand operand) {
        super(operand);
    }

    @Override
    public int GetResult() {
        return operand.getLeftOperand() + operand.getRightOperand();
    }
  }
