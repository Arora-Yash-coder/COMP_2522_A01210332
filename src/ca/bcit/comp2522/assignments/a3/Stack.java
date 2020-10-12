package ca.bcit.comp2522.assignments.a3;

public class Stack {

    int[] stackValues;

    int count;

    public Stack(final int arraySize) {
        if (arraySize < 1) {
            throw new IllegalArgumentException("Size of the stack cannot be 0 or negative.");
        } else {
            stackValues = new int[arraySize];
        }
    }

    public int capacity() {
        return stackValues.length;
    }

    public int size() {
        int c = 0;
        for (int i = 0; i < stackValues.length; i++) {
            if (stackValues[i] != Integer.parseInt(null)) {
                c++;
            }
        }
        return c;
    }

    public int unused() {
        return (stackValues.length - size());
    }

    public void push(int x) {
        if (unused() == 0) {
            System.out.println("This stack is full!");
        } else {
            stackValues[size()] = x;
        }
    }

    public int pop() {
        int x = 0;
        if (size() <= 0) {
            System.out.println("Cannot call Stack.pop() on an empty stack!");
        } else {
            x = stackValues[size() - 1];
            stackValues[size() - 1] = Integer.parseInt(null);
        }
        return x;
    }

    public int peek() {
        int x = 0;
        if (size() <= 0) {
            System.out.println("Cannot call Stack.peek() on an empty stack!");
        } else {
            x = stackValues[size() - 1];
        }
        return x;
    }






}