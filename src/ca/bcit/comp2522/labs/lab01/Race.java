/*
 Author: Yash Arora
 Student Id: A01210332
 Package Saves all the files for Lab01 for package-info.java
*/
package ca.bcit.comp2522.labs.lab01;

/*
Contains The Concept of a Race.
 */
public class Race {
    /* Save the length of the race.*/
    private final int length;
    /*Saves Object Hare.*/
    public Hare h;
    /*Saves Object Tortoise.*/
    public Tortoise t;



    public Race(final int length) {
        this.length = length;
        t = new Tortoise();
        h = new Hare();
    }
    /* Resets the positions of players in the race.*/
    public void reset() {
        h.setPosition(0);
        t.setPosition(0);
    }
    /* Simulates the Race.*/
    public String simulateRace() {
        reset();
        return " " + race();
    }

    private String race() {
        int tick = 0;
        String result = "";
        do {
            boolean x = Math.random() > 0.5 ? true: false;
            tick++;
            if (x) {
                t.move();
                h.move();
            } else {
                h.move();
                t.move();
            }
            if (t.getPosition() >= length) {
                result = t.toString();
                break;
            }
            if (h.getPosition() >= length) {
                result = h.toString();
                break;
            }

        }
        while (1 == 1);
        result += "tick " + tick;
        return result;
    }

}
