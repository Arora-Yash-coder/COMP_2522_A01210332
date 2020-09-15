/*
 Author: Yash Arora
 Student Id: A01210332
 Package Saves all the files for Lab01 for package-info.java
*/
package ca.bcit.comp2522.labs.lab01;

/* Drives the Whole Lab(Software).
* Tortoise Wins the most.
*/
public class Driver {
    /* Drives the program.*/
    public static void main(String[] args) {
        System.out.println(simulateRaces(100, 100));
    }

    /* Simulates a number of races with a particular Length;*/
    private static String simulateRaces(final int length, final int number) {
        String finalPrint = "";
        Race r = new Race(0);
        for (int i = 0; i < number; i++) {
            r = new Race(length);
            finalPrint += r.simulateRace();
        }
        return finalPrint;
    }
}
