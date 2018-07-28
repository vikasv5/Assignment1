public class Multiply extends MathOperation{
    public Multiply(Operand operand) {
        super(operand);
    }
    @Override
    public int GetResult() {
        return operand.getLeftOperand()*operand.getRightOperand();
    }
}
