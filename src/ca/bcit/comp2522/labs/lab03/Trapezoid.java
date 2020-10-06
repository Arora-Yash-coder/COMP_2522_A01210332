package ca.bcit.comp2522.labs.lab03;

import java.text.DecimalFormat;

public class Trapezoid extends Quadrilateral {
    /**
     * The Basis no.1 of the Trapezoid.
     */
    private final double basis1;
    /**
     * The Basis no.2 of the Trapezoid.
     */
    private final double basis2;
    /**
     * The Height of the Trapezoid.
     */
    private final double height;

    /**
     * Default Constructor.
     * @param x1 x of point 1.
     * @param y1 y of point 1.
     * @param x2 x of point 2.
     * @param y2 y of point 2.
     * @param x3 x of point 3.
     * @param y3 y of point 3.
     * @param x4 x of point 4.
     * @param y4 y of point 4.
     */
    public Trapezoid(final double x1, final double y1,
                     final double x2, final double y2,
                     final double x3, final double y3,
                     final double x4, final double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        height = Math.abs(x1 - x2);
        basis1 = y2 - y3;
        basis2 = y1 - y4;

    }

    /**
     * Calculates Area of the Trapezoid.
     * @return Area of Trapezoid.
     */
    public double area() {
        return Math.abs(0.5 * (basis1 + basis2) * height);
    }

    /**
     * Returns All the Values of a Trapezoid.
     * @return Trapezoid as a String.
     */
    public String toString() {
        // DecimalFormat class is used to format the output
        DecimalFormat df = new DecimalFormat(".0");
        return "\nCoordinates of Trapezoid are:\n"
                + super.toString()
                + "\nBasis1 is :"
                + df.format(basis1)
                + "\nBasis2 is :"
                + df.format(basis2)
                + "\nHeight is :"
                + df.format(height)
                + "\nArea is :"
                + df.format(area());
    }
}
