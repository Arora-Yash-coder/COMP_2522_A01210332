package ca.bcit.comp2522.labs.lab01;


public class Hare {
    public int position = 0;

    public int move(){
        return position;
    }

    @Override
    public boolean equals(Object o) {
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




}
