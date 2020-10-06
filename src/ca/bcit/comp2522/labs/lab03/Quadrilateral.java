package ca.bcit.comp2522.labs.lab03;

public class Quadrilateral {
    /**
     * Point 1 of the Quadrilateral.
     */
    private Point point1;
    /**
     * Point 2 of the Quadrilateral.
     */
    private Point point2;
    /**
     * Point 3 of the Quadrilateral.
     */
    private Point point3;
    /**
     * Point 4 of the Quadrilateral.
     */
    private Point point4;

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
    public Quadrilateral(final double x1, final double y1,
                          final double x2, final double y2,
                          final double x3, final double y3,
                          final double x4, final double y4) {
        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
        this.point3 = new Point(x3, y3);
        this.point4 = new Point(x4, y4);
    }

    /**
     * Accessor for point 1.
     * @return Point 1.
     */
    public Point getPoint1() {
        return point1;
    }

    /**
     * Mutator for Point 1.
     * @param point1 New Point 1 of the shape.
     */
    public void setPoint1(final Point point1) {
        this.point1 = point1;
    }

    /**
     * Accessor for point 2.
     * @return Point 2.
     */
    public Point getPoint2() {
        return point2;
    }

    /**
     * Mutator for Point 2.
     * @param point2 New Point 2 of the shape.
     */
    public void setPoint2(final Point point2) {
        this.point2 = point2;
    }

    /**
     * Accessor for point 3.
     * @return Point 3.
     */
    public Point getPoint3() {
        return point3;
    }

    /**
     * Mutator for Point 3.
     * @param point3 New Point 3 of the shape.
     */
    public void setPoint3(final Point point3) {
        this.point3 = point3;
    }

    /**
     * Accessor for point 4.
     * @return Point 4
     */
    public Point getPoint4() {
        return point4;
    }

    /**
     * Mutator for Point 4.
     * @param point4 New Point 4 of the shape.
     */
    public void setPoint4(final Point point4) {
        this.point4 = point4;
    }

    /**
     * Returns all the Details of the Quadrilateral.
     * @return Quadrilateral as a String.
     */
    public String toString() {
        return "{ " + point1
                + ", " + point2
                + ", " + point3
                + ", " + point4
                + '}';
    }
}
