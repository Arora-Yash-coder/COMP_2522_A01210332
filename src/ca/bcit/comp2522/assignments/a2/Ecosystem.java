package ca.bcit.comp2522.assignments.a2;

import java.util.ArrayList;
import java.util.Iterator;

public class Ecosystem {
    private ArrayList<Pool> pools;

    public Ecosystem() {
        pools = new ArrayList<Pool>();
    }

    public void addPool(Pool newPool) {
        if( newPool != null ) {
            pools.add(newPool);
        }
    }

    public void reset() {
        pools.clear();
    }

    public int getGuppyPopulation(){
        int result = 0;
        Iterator<Pool> iterator = pools.iterator();
        while(iterator.hasNext()){
            Pool pool = iterator.next();
            result += pool.getPopulation();
        }

        return result;
    }

    public int adjustForCrowding() {
        Iterator<Pool> p = pools.iterator();
        int result = 0;
        while (p.hasNext()){
            Pool pool = p.next();
            result += pool.adjustForCrowding();
        }
        return  result;
    }

    public  void setupSimulation(){
        pools.add(new Pool("Shookumchuk", 3000, 42, 7.9, 0.9));
        pools.add(new Pool("Squamish", 15000, 39, 7.7, 0.85));
        pools.add(new Pool("Semiahmoo", 4500, 37, 7.5, 1.0));
        

    }

    public void simulate(int numberOfWeeks){
        for (int i =0; i<numberOfWeeks;i++){
            simulateOneWeek();
        }
    }

    private void simulateOneWeek() {
        int diedOfOldAge = 0;
        int numberRemoved = 0;
        int starvedToDeath = 0;
        int smallFry = 0;
        int crowdedOut = 0;
        Iterator<Pool> iterator = pools.iterator();
        while (iterator.hasNext()) {
            Pool p = iterator.next();
            diedOfOldAge += p.incrementAges();
            numberRemoved += p.removeDeadGuppies();
            starvedToDeath += p.applyNutrientCoefficient();
            numberRemoved += p.removeDeadGuppies();
            smallFry += p.spawn();
            crowdedOut += p.adjustForCrowding();
            numberRemoved += p.removeDeadGuppies();
        }

        if(diedOfOldAge + starvedToDeath + crowdedOut == numberRemoved){
            System.out.println("Yay");
        }
        System.out.println("Hell Yeah");

    }




}
