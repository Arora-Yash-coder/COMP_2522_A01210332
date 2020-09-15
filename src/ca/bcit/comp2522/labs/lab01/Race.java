package ca.bcit.comp2522.labs.lab01;

public class Race {

    public int length;
    public Hare h;
    public Tortoise t;

    public Race(int length) {
        this.length = length;
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
        int tick = 0;
        String result ="";
        do {
            boolean x = Math.random() > 0.5 ? true: false;
            tick++;
            if (x) {
                t.move();
                h.move();
            } else {
                h.move();
                t.move();
            }
            if (t.getPosition() >= length) {
                result = t.toString();
                break;
            }
            if (h.getPosition() >= length){
                result = h.toString();
                break;
            }

        }
        while (1 ==1);
        return result;
    }

}
