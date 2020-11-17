package ca.bcit.comp2522.labs.lab05;

interface SubmarineInterface {
    int getMaxDepth();
    void setMaxDepth(int maxDepth);
}

public class SpyCar extends Car implements SubmarineInterface{

    private int maxDepth;

    public SpyCar() {
    }
    public SpyCar(String make, String model, int numPassengers, int topSpeed, int mileage, int maxDepth ) {
        super(make, model, numPassengers, topSpeed, mileage);
        this.maxDepth = maxDepth;
    }

    @Override
    public int getMaxDepth() {
        return maxDepth;
    }

    @Override
    public void setMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }
}
