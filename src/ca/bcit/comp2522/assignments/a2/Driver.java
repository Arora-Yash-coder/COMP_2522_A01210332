package ca.bcit.comp2522.assignments.a2;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Ecosystem eco = new Ecosystem();
        System.out.println("Please enter number of Weeks.");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        eco.simulate(x);
    }
}
