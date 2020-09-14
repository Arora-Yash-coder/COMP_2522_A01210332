package ca.bcit.comp2522.labs.lab01;


public class Tortoise {
    public int position = 0;

    public int move(){
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tortoise)) return false;
        Tortoise tortoise = (Tortoise) o;
        return getPosition() == tortoise.getPosition();
    }

    @Override
    public String toString() {
        return "Tortoise{" +
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
