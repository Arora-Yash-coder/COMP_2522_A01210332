package ca.bcit.comp2522.labs.lab05;

public class Vehicle {

    private String model;
    private String make;
    private int numPassengers;
    private int topSpeed;

    public Vehicle() {
    }

    public Vehicle(String model, String make, int numPassengers, int topSpeed) {
        this.model = model;
        this.make = make;
        this.numPassengers = numPassengers;
        this.topSpeed = topSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                '}';
    }
}
