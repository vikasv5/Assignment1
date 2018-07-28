public class Subtract extends MathOperation{
    public Subtract(Operand operand) {
        super(operand);
    }
    @Override
    public int GetResult() {
        return operand.getLeftOperand()-operand.getRightOperand();
    }
}
