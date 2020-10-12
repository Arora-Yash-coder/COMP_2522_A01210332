package ca.bcit.comp2522.assignments.a3;

public class AdditionOperation extends AbstractOperation {

    private static final char ADDITION_CODE = '+';

    AdditionOperation(char operationType) {
        super(operationType);
    }

    @Override
    public int perform(int operandA, int operandB) {
        return (operandA + operandB);
    }
}
