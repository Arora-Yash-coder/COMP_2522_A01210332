/*

 */
package ca.bcit.comp2522.labs.lab01;



public class Hare {

  public int position = 0;

    public int move() {
        double x = Math.random();
        if (range(0.70, 1,x)) {
            position -= 2;
        } else if (range(.20, 0.30,x)) {
            position += 9;
        } else if (range(.30, 0.40,x)) {
            position -= 12;
        } else if (range(.40, 0.70,x)) {
            position += 1;
        }
        return position;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Hare)) return false;
        Hare hare = (Hare) o;
        return getPosition() == hare.getPosition();
    }

    @Override
    public String toString() {
        return "Hare{" +
                "position=" + position +
                '}';
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public static Boolean range(double p1, double p2, double r) {
        return (p1 <= r && r <= p2);
    }

}
