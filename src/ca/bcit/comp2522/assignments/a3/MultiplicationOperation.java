package ca.bcit.comp2522.assignments.a3;

public class MultiplicationOperation extends AbstractOperation{

    private static final char MULTIPLICATION_CODE = '*';

    MultiplicationOperation(char operationType) {
        super(operationType);
    }

    @Override
    public int perform(int operandA, int operandB) {
        return (operandA * operandB);
    }
}
