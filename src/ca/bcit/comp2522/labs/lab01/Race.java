package ca.bcit.comp2522.labs.lab01;

public class Race {

    public int lenght;
    public Hare h;
    public Tortoise t;

    public Race(int lenght) {
        this.lenght = lenght;
        t = new Tortoise();
        h = new Hare();
    }

    public void reset(){
        h.setPosition(0);
        t.setPosition(0);
    }
    public String simulateRace(){
        reset();
        return "The Winner is " + race();
    }

    private String race() {
//        do {
//            // code block to be executed
//        }
//        while ();
        return null;
    }

}
