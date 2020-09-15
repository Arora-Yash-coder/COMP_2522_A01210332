package ca.bcit.comp2522.labs.lab01;

import java.lang.reflect.Array;

public class Driver {

    public static void main(String[] args) {
        System.out.println(simulateRaces(10, 1000));


    }

    private static String simulateRaces(final int length, final int number) {
        String finalPrint = "";
        for (int i = 0; i < number; i++) {
            Race r = new Race(length);
            finalPrint += r.simulateRace();
        }
        return finalPrint;
    }
}
