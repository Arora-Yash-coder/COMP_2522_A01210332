/*
 Author: Yash Arora
 Student Id: A01210332
 Package Saves all the files for Lab01 for package-info.java
*/
package ca.bcit.comp2522.labs.lab01;


public class Tortoise {
    /*
    Saves The Position of the tortoise.
     */
    private int position = 0;

    /*
    DeterMines How The Tortoise Is going to Move.
    */
    public int move() {
        double x = Math.random();
        if (range(0, 0.5, x)) {
            position -= 3;
        } else if (range(0.5, 0.70, x)) {
            position += 6;
        } else {
            position += 1;
        }
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tortoise)) return false;
        Tortoise tortoise = (Tortoise) o;
        return getPosition() == tortoise.getPosition();
    }

    @Override
    public String toString() {
        return "Tortoise{ position=" + position
                + '}';
    }

    /* Getter For Tortoise Position.*/
    public int getPosition() {
        return position;
    }
    /* Setter For Tortoise Position.*/
    public void setPosition(final int position) {
        this.position = position;
    }
    /* Sees if a number is in Range or Not.*/
    public static Boolean range(final double p1, final double p2, final double r) {
        return (p1 <= r && r <= p2);
    }


}
