package ca.bcit.comp2522.labs.lab03;

public class Quadrilateral {

    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public  Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
        this.point3 = new Point(x3, y3);
        this.point4 = new Point(x4, y4);
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public void setPoint4(Point point4) {
        this.point4 = point4;
    }

    @Override
    public String toString() {
        return "Quadrilateral{ "  + point1 +
                ", " + point2 +
                ", " + point3 +
                ", " + point4 +
                '}';
    }
}
