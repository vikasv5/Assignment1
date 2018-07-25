public class Multiply implements OperationTypeInterface{

    @Override
    public int GetResult(Operand op) {
        return op.getLeftOperand()*op.getRightOperand();
    }
    
}
