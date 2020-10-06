package ca.bcit.comp2522.labs.lab03;

import java.text.DecimalFormat;

public class Parallelogram extends Quadrilateral {
    /**
     * Width of Parallelogram.
     */
    private double width;
    /**
     * Height of Parallelogram.
     */
    private double height;

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
    public Parallelogram(final double x1, final double y1,
                         final double x2, final double y2,
                         final double x3, final double y3,
                         final double x4, final double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        width = Math.sqrt(Math.pow((getPoint2().getX() - getPoint1().getX()), 2)
                + Math.pow((getPoint2().getY() - getPoint1().getY()), 2));
        height = Math.sqrt(Math.pow((getPoint4().getX() - getPoint1().getX()), 2)
                + Math.pow((getPoint4().getY() - getPoint1().getY()), 2));
    }

    /**
     * Calculate the Area of the Parallelogram.
     * @return Area of the Parallelogram
     */
    public double area() {
        return (width * height);
    }

    /**
     * All the Details of the Parallelogram.
     * @return Parallelogram as a String.
     */
    public String toString() {
        // DecimalFormat class is used to format the output
        DecimalFormat df = new DecimalFormat(".0");
        return "\nCoordinates of Parallelogram are:\n"
                + super.toString()
                + "\nWidth is :"
                + df.format(width)
                + "\nHeight is :"
                + df.format(height)
                + "\nArea is :"
                + df.format(area());
    }

}
