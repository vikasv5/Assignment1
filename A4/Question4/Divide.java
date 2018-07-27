public class Divide extends MathOperation{

    public Divide(Operand operand) {
        super(operand);
    }

    @Override
    public int GetResult() {
        return operand.getLeftOperand()/operand.getRightOperand();
    }
    
}
