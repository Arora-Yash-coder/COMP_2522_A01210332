package ca.bcit.comp2522.assignments.a3;

public class DivisionOperation extends AbstractOperation {

    private static final char DIVISION_CODE = '/';

    DivisionOperation(final char operationType) {
        super(operationType);
    }

    @Override
    public int perform(final int operandA, final int operandB) {
        return (operandA / operandB);
    }
}
