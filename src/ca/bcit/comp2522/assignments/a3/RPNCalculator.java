package ca.bcit.comp2522.assignments.a3;

import javax.management.openmbean.InvalidOpenTypeException;
import java.util.Scanner;

public class RPNCalculator {

    private static final int MIN_STACK_SIZE = 2;
    public Stack stack;
    public RPNCalculator(int stackSize) {
        if (stackSize < MIN_STACK_SIZE) {
            throw new IllegalArgumentException("The String ids too short.");
        } else {
            stack = new Stack(stackSize);
        }
    }

    public static void main(final String[] argv) {
        // Checks for correct number of command line arguments.
        if (argv.length != 2) {
            System.err.println("Usage: Main <stack size> <formula>");
            System.exit(1);
        }
        // Initializes stack and RPNCalculator.
        final int stackSize = Integer.parseInt(argv[0]);
        final RPNCalculator calculator = new RPNCalculator(stackSize);
        try {
            System.out.println("[" + argv[1] + "] = "
                    + calculator.processFormula(argv[1]));
        } catch (final InvalidOpenTypeException ex) {
            System.err.println("formula can only contain integers, +, -, *, and /");
        } catch (final StackOverflowError ex) {
            System.err.println("too many operands in the formula, increase the stack size");
        }
//        } catch (final StackUnderflowError ex) {
//            System.err.println("too few operands in the formula");
//        }
    }

    public int processFormula(final String formula) {
        Operation o;
        if (formula.length() <= 0 || formula == null) {
            throw new IllegalArgumentException("The string is null.");
        } else {
            Scanner scanner = new Scanner(formula);
            while (scanner.hasNext()) {
                if(scanner.hasNextInt()){
                    stack.push(scanner.nextInt());
                } else {
                    o = getOperation(scanner.next().charAt(0));
                    perform(o);
                }
            }
        }
        return 0;
    }

    private void perform(Operation o) {
        if (o != null) {

        } else {
            System.out.println("Operation cannot be null.");
        }
    }

    private Operation getOperation(final char symbol) {
        switch (symbol) {
            case '+':
                return new AdditionOperation('+');
            case '-':
                return new SubtractionOperation('-');
            case '*':
                return new MultiplicationOperation('*');
            case '/':
                return new DivisionOperation('/');
            default:
                throw new InvalidOpenTypeException("Invalid Operation");
        }

    }

}
