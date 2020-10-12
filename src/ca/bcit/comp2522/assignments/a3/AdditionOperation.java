package ca.bcit.comp2522.assignments.a3;

public class AdditionOperation extends AbstractOperation {
    /**
     * The Code for the Operation.
     */
    private static final char ADDITION_CODE = '+';

    AdditionOperation(final char operationType) {
        super(operationType);
    }

    /**
     * Performs the Operation.
     * @param operandA First Value
     * @param operandB Second Value
     * @return The Result
     */
    @Override
    public int perform(final int operandA, final int operandB) {
        return (operandA + operandB);
    }
}
