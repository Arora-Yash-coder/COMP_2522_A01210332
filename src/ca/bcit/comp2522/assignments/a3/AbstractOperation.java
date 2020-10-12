package ca.bcit.comp2522.assignments.a3;

abstract class AbstractOperation implements Operation {
    /**
     * Type of the operation.
     */
    protected char operationType;

    AbstractOperation(final char operationType) {
        this.operationType = operationType;
    }

    public final char getSymbol() {
        return operationType;
    }
}
