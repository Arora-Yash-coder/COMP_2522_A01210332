package ca.bcit.comp2522.labs.lab03;

public class Point {

    /**
     * Saves the X Coordinate of the Point.
     */
    private double x;

    /**
     * Saves the Y Coordinate of the Point.
     */
    private double y;

    /**
     * Default Constructor of the Class.
     * @param x X coordinate of the point
     * @param y Y coordinate of the point
     */
    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Accessor for X coordinate of the point.
     * @return X coordinate of the point
     */
    public double getX() {
        return x;
    }

    /**
     * Mutator for X coordinate of the point.
     * @param x New Value of X coordinate of the point.
     */
    public void setX(final double x) {
        this.x = x;
    }

    /**
     * Accessor for Y coordinate of the point.
     * @return Y coordinate of the point.
     */
    public double getY() {
        return y;
    }

    /**
     * Mutator for Y coordinate of the point.
     * @param y New Value of the Y coordinate.
     */
    public void setY(final double y) {
        this.y = y;
    }

    /**
     * Returns all the details of a point.
     * @return The Point as a String.
     */
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}
