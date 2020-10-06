package ca.bcit.comp2522.labs.lab03;

import java.text.DecimalFormat;

public class Trapezoid extends Quadrilateral{
    private double basis1;
    private double basis2;
    private double height;
    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3,
                     double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        height=Math.abs(x1-x2);
        basis1=y2-y3;
        basis2=y1-y4;

    }

    public double area() {
        return Math.abs(0.5*(basis1+basis2)*height);
    }
    @Override
    public String toString() {
        // DecimalFormat class is used to format the output
        DecimalFormat df = new DecimalFormat(".0");
        return "\nCoordinates of Trapezoid are:\n" + super.toString()
                + "\nBasis1 is :" + df.format(basis1)+"\nBasis2 is :"+df.format(basis2)+"\nHeight is :"+df.format(height)+"\nArea is :" + df.format(area());
    }
}
