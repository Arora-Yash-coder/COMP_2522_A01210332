/*
 Author: Yash Arora
 Student Id: A01210332
 Package Saves all the files for Lab01 for package-info.java
*/
package ca.bcit.comp2522.labs.lab01;

/*
This class contains the concept of a Hare.
 */
public class Hare {
    /*
    Saves The Position of the tortoise.
   */
    private int position = 0;
    /*
    This Method chooses the moves of an Hare.
    */
    public int move() {
        double x = Math.random();
        if (range(0.70, 1, x)) {
            position -= 2;
        } else if (range(.20, 0.30, x)) {
            position += 9;
        } else if (range(.30, 0.40, x)) {
            position -= 12;
        } else if (range(.40, 0.70, x)) {
            position += 1;
        }
        return position;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Hare)) return false;
        Hare hare = (Hare) o;
        return getPosition() == hare.getPosition();
    }

    @Override
    public String toString() {
        return "Hare position=" + position + " ";
    }
    /* Getter For Hare Position.*/
    public int getPosition() {
        return position;
    }
    /* Setter for Hare Position*/
    public void setPosition(int position) {
        this.position = position;
    }
    /* Sees if a number is in Range or Not.*/
    public static Boolean range(double p1, double p2, double r) {
        return (p1 <= r && r <= p2);
    }

}
