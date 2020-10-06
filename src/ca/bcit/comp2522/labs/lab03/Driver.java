package ca.bcit.comp2522.labs.lab03;

/**
 * Tests for Lab03.
 */
public class Driver {
    /**
     * Drives the Program.
     * @param args Takes in all the arguments used to run the program.
     */
    public static void main(final String[] args) {
        // NOTE: All coordinates are assumed to form the proper shapes
        // A quadrilateral is a four-sided polygon
        Quadrilateral[] quadrilateral = {
                new Trapezoid(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4),
                new Parallelogram(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0),
                new Rectangle(17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0),
                new Square(4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0) };

        for (Quadrilateral value : quadrilateral) {
            System.out.println(value);
        }

    }

}
