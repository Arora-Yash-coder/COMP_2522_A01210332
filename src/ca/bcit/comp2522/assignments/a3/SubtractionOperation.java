package ca.bcit.comp2522.assignments.a3;

public class SubtractionOperation extends AbstractOperation{

    private static final char SUBTRACTION_CODE = '-';

    SubtractionOperation(char operationType) {
        super(operationType);
    }

    @Override
    public int perform(int operandA, int operandB) {
        return (operandA - operandB);
    }
}
