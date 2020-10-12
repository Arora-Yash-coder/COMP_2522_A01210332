package ca.bcit.comp2522.assignments.a3;

public interface Operation {
    /**
     * Returns the operation type of the Class.
     * @return Operation Type
     */
    char getSymbol();

    /**
     * Completes the operation.
     * @param operandA First Value
     * @param operandB Second Value
     * @return The Result
     */
    int perform(int operandA, int operandB);

}
