package ca.bcit.comp2522.labs.lab03;

import java.text.DecimalFormat;

public class Square extends Quadrilateral {
    /**
     * Length of the side of a Square.
     */
    private final double side;

    /**
     * Default Constructor of the Class.
     * @param x1 x of point 1.
     * @param y1 y of point 1.
     * @param x2 x of point 2.
     * @param y2 y of point 2.
     * @param x3 x of point 3.
     * @param y3 y of point 3.
     * @param x4 x of point 4.
     * @param y4 y of point 4.
     */
    public Square(final double x1, final double y1,
                  final double x2, final double y2,
                  final double x3, final double y3,
                  final double x4, final double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        side = Math.sqrt(Math.pow((getPoint2().getX() - getPoint1().getX()), 2)
                + Math.pow((getPoint2().getY() - getPoint1().getY()), 2));
    }

    /**
     * Calculates the area of the Square.
     * @return Area of the Square.
     */
    public double area() {
        return (4 * side);
    }

    /**
     * Returns all the details of the Square.
     * @return Square as a String.
     */
    public String toString() {
        // DecimalFormat class is used to format the output
        DecimalFormat df = new DecimalFormat(".0");
        return "\nCoordinates of Square are:\n" + super.toString()
                + "\nSide is :" + df.format(side)
                + "\nArea is :" + df.format(area());
    }
}
