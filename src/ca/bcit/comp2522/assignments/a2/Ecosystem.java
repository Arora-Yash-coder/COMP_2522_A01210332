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
        setupSimulation();
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
        int weekNum = 0;
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
        weekNum++;
        if(diedOfOldAge + starvedToDeath + crowdedOut == numberRemoved){
            System.out.println("The Function is Working ");
        }
        System.out.println("Week Number: " + weekNum + ".\n");
        System.out.println("Number of deaths this week due to old age: " + diedOfOldAge + ".");
        System.out.println("Number of deaths this week due to starvation: " + starvedToDeath + ".");
        System.out.println("Number of deaths this week due to overcrowding: " + crowdedOut + ".");
        System.out.println("Number of births (new fry) this week: " + smallFry + ".");
//        System.out.println("List of pools and their current populations at the end of the week: " + pools.toString());
        int totalpop = 0;
        Iterator<Pool> iterator1 = pools.iterator();
        while (iterator1.hasNext()) {
            Pool p = iterator1.next();
            totalpop += p.getPopulation();
        }
//        System.out.println("Total population of the Ecosystem at the end of the week: " + totalpop);
    }




}
