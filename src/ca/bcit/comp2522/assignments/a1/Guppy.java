package ca.bcit.comp2522.assignments.a1;

/*
This class represents the concept of Guppy
 */
public class Guppy {

    /*
    Constants Used.\
     */
    final private static int YOUNG_FISH_AGE_IN_YEARS = 10;
    final private static int MATURE_FISH_AGE_IN_YEARS = 30;
    final private static int MAXIMUM_AGE_IN_WEEKS = 50;
    final private static double MINIMUM_WATER_VOLUME_ML = 250.0;
    final private static String DEFAULT_GENUS = "Poecilia";
    final private static String DEFAULT_SPECIES = "reticulata";
    final private static double DEFAULT_HEALTH_COEFFICIENT = 0.5;
    final private static double MINIMUM_HEALTH_COEFFICIENT = 1.0;
    final private static double MAXIMUM_HEALTH_COEFFICIENT = 1.0;

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

        this.genus = newGenus.substring(0,1).toUpperCase() + newGenus.substring(1);
        this.species = newSpecies.toLowerCase();
        this.ageInWeeks = Math.max(newAgeInWeeks, 0);
        this.isFemale = newIsFemale;
        if (newGenerationNumber < 0){
            this.generationNumber = 1;
        } else {
            this.generationNumber = newGenerationNumber;
        }
        if (newHealthCoefficient > MAXIMUM_HEALTH_COEFFICIENT){
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
        if(ageInWeeks > MAXIMUM_AGE_IN_WEEKS){
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

    public boolean isFemale() {
        return isFemale;
    }

    public int getGenerationNumber() {
        return generationNumber;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public double getHealthCoefficient() {
        return healthCoefficient;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setAgeInWeeks(int ageInWeeks) {
        if(ageInWeeks > 0 && ageInWeeks < MAXIMUM_AGE_IN_WEEKS){
            this.ageInWeeks = ageInWeeks;
        }
    }

    public void setAlive(boolean alive) {
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
            return MINIMUM_WATER_VOLUME_ML*ageInWeeks/YOUNG_FISH_AGE_IN_YEARS;
        } else if (this.ageInWeeks > 30 && this.ageInWeeks < 51 ){
            return  MINIMUM_WATER_VOLUME_ML*1.5;
        } else {
            return 0.0;
        }
    }

    /*
    Changes the Health Coefficient of Guppy Fish.
     */
    public void changeHealthCoefficient (double delta) {
        this.healthCoefficient += delta;
        if(this.healthCoefficient < MINIMUM_HEALTH_COEFFICIENT){
            this.healthCoefficient = 0.0;
            this.isAlive = false;
        } else if( this.healthCoefficient >= MAXIMUM_HEALTH_COEFFICIENT){
            this.healthCoefficient = MAXIMUM_HEALTH_COEFFICIENT;
        }

    }

    @Override
    public String toString() {
        return "Guppy{" +
                "YOUNG_FISH_AGE_IN_YEARS=" + YOUNG_FISH_AGE_IN_YEARS +
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
}

