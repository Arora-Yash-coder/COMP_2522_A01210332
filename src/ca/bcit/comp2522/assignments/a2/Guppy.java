package ca.bcit.comp2522.assignments.a2;

import java.util.ArrayList;
import java.util.Random;

/*
This class represents the concept of Guppy
 */
public class Guppy {

    /*
    Constants Used.\
     */
    public static final int YOUNG_FISH_AGE_IN_WEEKS = 10;
    public static final int MATURE_FISH_AGE_IN_WEEKS = 30;
    public static final int MAXIMUM_AGE_IN_WEEKS = 50;
    public static final double MINIMUM_WATER_VOLUME_ML = 250.0;
    public static final String DEFAULT_GENUS = "Poecilia";
    public static final String DEFAULT_SPECIES = "reticulata";
    public final static double DEFAULT_HEALTH_COEFFICIENT = 0.5;
    public final static double MINIMUM_HEALTH_COEFFICIENT = 1.0;
    public final static double MAXIMUM_HEALTH_COEFFICIENT = 1.0;
    public static final int    MAXIMUM_BABIES = 100;
    public static final double MAXIMUM_CHANCE_OF_SPAWN = 0.50;
    public static final int    MINIMUM_AGE_OF_SPAWN = 8;

    private String genus;
    private String species;
    private int ageInWeeks;
    private boolean isFemale;
    private int generationNumber;
    private boolean isAlive;
    private double healthCoefficient;
    private int identificationNumber;

    private static int numberOfGuppiesBorn = 0;

    /*
    Creates a Guppy Fish Object.
     */
    public Guppy() {
        ageInWeeks = 0;
        generationNumber = 0;
        genus = DEFAULT_GENUS;
        species = DEFAULT_SPECIES;
        isFemale = true;
        isAlive = true;
        healthCoefficient = DEFAULT_HEALTH_COEFFICIENT;
        numberOfGuppiesBorn++;
        identificationNumber = numberOfGuppiesBorn;
    }

    /*
    Creates a Guppy Fish Object.
     */
    public Guppy(String newGenus, String newSpecies, int newAgeInWeeks, boolean newIsFemale, int newGenerationNumber, double newHealthCoefficient) {

        this.genus = newGenus.substring(0, 1).toUpperCase() + newGenus.substring(1);
        this.species = newSpecies.toLowerCase();
        this.ageInWeeks = Math.max(newAgeInWeeks, 0);
        this.isFemale = newIsFemale;
        if (newGenerationNumber < 0) {
            this.generationNumber = 1;
        } else {
            this.generationNumber = newGenerationNumber;
        }
        if (newHealthCoefficient > MAXIMUM_HEALTH_COEFFICIENT) {
            this.healthCoefficient = MAXIMUM_HEALTH_COEFFICIENT;
        } else {
            this.healthCoefficient = Math.max(newHealthCoefficient, MINIMUM_HEALTH_COEFFICIENT);
        }

        numberOfGuppiesBorn++;
        identificationNumber = numberOfGuppiesBorn;
    }

    /*
    Increses the age of Guppy Fish.
     */
    public void incrementAge() {
        ageInWeeks++;
        if (ageInWeeks > MAXIMUM_AGE_IN_WEEKS) {
            isAlive = false;
        }
    }


    public String getGenus() {
        return genus;
    }

    public String getSpecies() {
        return species;
    }

    public int getAgeInWeeks() {
        return ageInWeeks;
    }

    public boolean getIsFemale() {
        return isFemale;
    }

    public int getGenerationNumber() {
        return generationNumber;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public double getHealthCoefficient() {
        return healthCoefficient;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }


    public void setAgeInWeeks(int ageInWeeks) {
        if (ageInWeeks > 0 && ageInWeeks < MAXIMUM_AGE_IN_WEEKS) {
            this.ageInWeeks = ageInWeeks;
        }
    }

    public void setIsAlive(boolean alive) {
        isAlive = alive;
    }

    public void setHealthCoefficient(double healthCoefficient) {
        if (!(healthCoefficient < 0) && !(healthCoefficient > MAXIMUM_HEALTH_COEFFICIENT)) {
            this.healthCoefficient = healthCoefficient;
        }
    }

    public static int getNumberOfGuppiesBorn() {
        return numberOfGuppiesBorn;
    }

    /*
    It returns the Volume o Water needed by Guppy Fish.
     */
    public double getVolumeNeeded() {
        if (this.ageInWeeks < 10) {
            return MINIMUM_WATER_VOLUME_ML;
        } else if (this.ageInWeeks > 9 && this.ageInWeeks < 31) {
            return MINIMUM_WATER_VOLUME_ML * ageInWeeks / YOUNG_FISH_AGE_IN_WEEKS;
        } else if (this.ageInWeeks > 30 && this.ageInWeeks < 51) {
            return MINIMUM_WATER_VOLUME_ML * 1.5;
        } else {
            return 0.0;
        }
    }

    /*
    Changes the Health Coefficient of Guppy Fish.
     */
    public void changeHealthCoefficient(double delta) {
        this.healthCoefficient += delta;
        if (this.healthCoefficient < MINIMUM_HEALTH_COEFFICIENT) {
            this.healthCoefficient = 0.0;
            this.isAlive = false;
        } else if (this.healthCoefficient >= MAXIMUM_HEALTH_COEFFICIENT) {
            this.healthCoefficient = MAXIMUM_HEALTH_COEFFICIENT;
        }

    }

    @Override
    public String toString() {
        return "Guppy{" +
                "YOUNG_FISH_AGE_IN_YEARS=" + YOUNG_FISH_AGE_IN_WEEKS +
                ", genus='" + genus + '\'' +
                ", species='" + species + '\'' +
                ", ageInWeeks=" + ageInWeeks +
                ", isFemale=" + isFemale +
                ", generationNumber=" + generationNumber +
                ", isAlive=" + isAlive +
                ", healthCoefficient=" + healthCoefficient +
                ", identificationNumber=" + identificationNumber +
                '}';
    }

    /*
    Checks if 2 Guppy Fishes are equal.
     */
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /*
     Spawns new baby fries.
     */
    public ArrayList<Guppy> spawn(){
        if (getIsFemale() && getAgeInWeeks()>=MINIMUM_AGE_OF_SPAWN) { //Check is female and spawn age is >= 8
        Random r=new Random();
            if(r.nextDouble()>MAXIMUM_CHANCE_OF_SPAWN) return null; // don't spawn chance greater than 0.50
            int cntBabies=r.nextInt(MAXIMUM_BABIES+1);
            if (cntBabies>0) {
                ArrayList<Guppy> babyGuppies=new ArrayList<Guppy>();
                for(int i=0;i<cntBabies;i++){
                    babyGuppies.add(new Guppy( getGenus()
                                           ,getSpecies()
                                           ,0
                                           ,r.nextBoolean()
                                           ,getGenerationNumber()+1
                                           ,(getHealthCoefficient()+1)/2
                                         )
                               );
                }
                return babyGuppies;
            }
        }
        return null;
    }
}






