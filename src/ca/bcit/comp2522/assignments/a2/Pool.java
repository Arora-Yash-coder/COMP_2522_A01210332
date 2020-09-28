package ca.bcit.comp2522.assignments.a2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

class Pool {
    public static final String DEFAULT_POOL_NAME = "Unnamed";
    public static final double DEFAULT_POOL_TEMP_CELSIUS = 40.0;
    public static final double MINIMUM_POOL_TEMP_CELSIUS = 0.0;
    public static final double MAXIMUM_POOL_TEMP_CELSIUS = 100.0;
    public static final double NEUTRAL_PH = 7.0;
    public static final double MINIMUM_PH = 0.0;
    public static final double MAXIMUM_PH = 14.0;
    public static final double DEFAULT_NUTRIENT_COEFFICIENT = 0.5;
    public static final double MINIMUM_NUTRIENT_COEFFICIENT = 0.0;
    public static final double MAXIMUM_NUTRIENT_COEFFICIENT = 1.0;

    private String name;
    private double volumeLitres;
    private double temperatureCelsius;
    private double pH;
    private double nutrientCoefficient;
    private ArrayList <Guppy> guppiesInPool;
    private Random randomNumberGenerator;
    private int identificationNumber;

    private static int numberOfPools = 0;
    /**
     * Zero-parameter constructor for objects of class Pool initializes
     * all fields to defaults. Note that the identification number is set automatically.
     */
    public Pool() {
        name = DEFAULT_POOL_NAME;
        volumeLitres = 0.0;
        temperatureCelsius = DEFAULT_POOL_TEMP_CELSIUS;
        pH = NEUTRAL_PH;
        nutrientCoefficient = DEFAULT_NUTRIENT_COEFFICIENT;
        guppiesInPool = new ArrayList < > ();
        randomNumberGenerator = new Random();
        numberOfPools = numberOfPools + 1;
        identificationNumber = numberOfPools;
    }
    /**
     * Constructor for objects of class Pool. Note that the identification
     * number is set automatically.
     *
     * @param name
     * the Pool's name, a String. Pool names cannot be null and cannot
     * be Strings containing only whitespace.
     * @param volumeLitres
     * a double representing the Pool's volume in litres
     * @param temperatureCelsius
     * a double representing the Pool's temperature. Must be in the
     * range [MINIMUM_POOL_TEMP_CELSIUS, MAXIMUM_POOL_TEMP_CELSIUS] else set to
     * DEFAULT_POOL_TEMP_CELSIUS.
     * @param pH
     * a double representing the Pool's pH. Must be in the range
     * [MINIMUM_PH, MAXIMUM_PH] else set to DEFAULT_PH.
     * @param nutrientCoefficient
     * a double representing the Pool's nutrientCoefficient. Must be
     * in the range [MINIMUM_NUTRIENT_COEFFICIENT,
     * MAXIMUM_NUTRIENT_COEFFICIENT] else set to DEFAULT_NUTRIENT_COEFFICIENT.
     */
    public Pool(String name,
                double volumeLitres,
                double temperatureCelsius,
                double pH,
                double nutrientCoefficient) {
        setName(name);

        setVolume(volumeLitres);
        setTemperature(temperatureCelsius);
        if (temperatureCelsius < MINIMUM_POOL_TEMP_CELSIUS || temperatureCelsius > MAXIMUM_POOL_TEMP_CELSIUS) {
            setTemperature(DEFAULT_POOL_TEMP_CELSIUS);
        } else {
            setTemperature(temperatureCelsius);
        }
        if (pH < MINIMUM_PH || pH > MAXIMUM_PH) {
            setPH(NEUTRAL_PH);
        } else {
            setPH(pH);
        }
        if (nutrientCoefficient < MINIMUM_NUTRIENT_COEFFICIENT || nutrientCoefficient > MAXIMUM_NUTRIENT_COEFFICIENT) {
            setNutrientCoefficient(DEFAULT_NUTRIENT_COEFFICIENT);
        } else {
            setNutrientCoefficient(nutrientCoefficient);
        }
        numberOfPools++;
        identificationNumber = numberOfPools;
        guppiesInPool = new ArrayList <Guppy> ();
        randomNumberGenerator = new Random();
    }
    /**
     * Returns the name.
     *
     * @return name as a String
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name in title case. Ignores null and empty String parameters.
     *
     * @param name a String
     */
    public final void setName(String name) {
        if (name != null && name.trim().length() > 0) {
            this.name = formatNameTitleCase(name);
        }
        if (this.name == null) {
            this.name = DEFAULT_POOL_NAME;
        }
    }
    /**
     * Returns the volume in litres of this Pool.
     *
     * @return volumeLitres a double
     */
    public double getVolume() {
        return volumeLitres;
    }
    /**
     * Sets the volume of this Pool in litres. Ignores negative parameters.
     *
     * @param volumeLitres a double
     */
    public final void setVolume(double volumeLitres) {
        if (volumeLitres >= 0) {
            this.volumeLitres = volumeLitres;
        }
    }
    /**
     * Returns the temperature of this Pool in degrees Celsius.
     *
     * @return temperatureCelsius a double
     */
    public double getTemperature() {
        return temperatureCelsius;
    }
    /**
     * Sets the temperature of this Pool in degrees Celsius. Ignores parameters
     * outside of range [MINIMUM_POOL_TEMP_CELSIUS, MAXIMUM_POOL_TEMP_CELSIUS].
     *
     * @param temperatureCelsius a double
     */
    public final void setTemperature(double temperatureCelsius) {
        if (temperatureCelsius >= MINIMUM_POOL_TEMP_CELSIUS && temperatureCelsius <= MAXIMUM_POOL_TEMP_CELSIUS) {
            this.temperatureCelsius = temperatureCelsius;
        }
    }
    /**
     * Returns the pH of this Pool.
     *
     * @return pH a double
     */
    public double getPH() {
        return pH;
    }
    /**
     * Sets the pH of this Pool. Ignores parameters outside of range
     * [MINIMUM_PH, MAXIMUM_PH].
     *
     * @param pH a double
     */
    public final void setPH(double pH) {
        if (pH >= MINIMUM_PH && pH <= MAXIMUM_PH) {
            this.pH = pH;
        }
    }
    /**
     * Returns the nutrient coefficient.
     *
     * @return nutrientCoefficient a double
     */
    public double getNutrientCoefficient() {
        return nutrientCoefficient;
    }
    /**
     * Sets the nutrient coefficient. Ignores parameters outside of range
     * [MINIMUM_NUTRIENT_COEFFICIENT, MAXIMUM_NUTRIENT_COEFFICIENT].
     *
     * @param nutrientCoefficient a double
     */
    public final void setNutrientCoefficient(double nutrientCoefficient) {
        if (nutrientCoefficient >= MINIMUM_NUTRIENT_COEFFICIENT && nutrientCoefficient <= MAXIMUM_NUTRIENT_COEFFICIENT) {
            this.nutrientCoefficient = nutrientCoefficient;
        }
    }
    /**
     * Returns this Pool's identification number.
     *
     * @return identificationNumber as an int
     */
    public int getIdentificationNumber() {
        return identificationNumber;
    }
    /**
     * Returns a reference to the collection of Guppies.
     *
//     * @return guppyPopulation an ArrayList<Guppy>
     */
//    public ArrayList <Guppy> getGuppies() {
//        return guppiesInPool;
//    }
    /**
     * Sets the collection of Guppies.
     *
     * @param guppyPopulation an ArrayList<Guppy>
     */
    public void setGuppies(ArrayList <Guppy> guppyPopulation) {
        if (guppyPopulation != null) {
            this.guppiesInPool = guppyPopulation;
        }
    }
    /**
     * Changes the nutrient coefficient by the specified delta. The nutrient
     * coefficient will remain in the range [MINIMUM_NUTRIENT_COEFFICIENT, MAXIMUM_NUTRIENT_COEFFICIENT].
     *
     * @param delta the amount to change the nutrient coeffficient a double
     */
    public void changeNutrientCoefficient(double delta) {
        double newNutrientCoefficient = getNutrientCoefficient() + delta;
        if (newNutrientCoefficient < MINIMUM_NUTRIENT_COEFFICIENT) {
            setNutrientCoefficient(MINIMUM_NUTRIENT_COEFFICIENT);
        } else if (newNutrientCoefficient > MAXIMUM_NUTRIENT_COEFFICIENT) {
            setNutrientCoefficient(MAXIMUM_NUTRIENT_COEFFICIENT);
        } else {
            setNutrientCoefficient(newNutrientCoefficient);
        }
    }
    /**
     * Changes the temperature by the specified delta. The temperature will
     * remain in the range [MINIMUM_POOL_TEMP_CELSIUS, MAXIMUM_POOL_TEMP_CELSIUS].
     *
     * @param delta the amount to change the temperature a double
     */
    public void changeTemperature(double delta) {
        double newTemperature = getTemperature() + delta;
        if (newTemperature < MINIMUM_POOL_TEMP_CELSIUS) {
            setTemperature(MINIMUM_POOL_TEMP_CELSIUS);
        } else if (newTemperature > MAXIMUM_POOL_TEMP_CELSIUS) {
            setTemperature(MAXIMUM_POOL_TEMP_CELSIUS);
        } else {
            setTemperature(newTemperature);
        }
    }
    /**
     * Returns total number of Pools created.
     *
     * @return numberOfPools the number of Pool objects instantiated
     */
    public static int getNumberCreated() {
        return numberOfPools;
    }
    /**
     * Adds the specified Guppy to the pool.
     *
     * @param guppy the Guppy to add
     */
    public void addGuppy(Guppy guppy) {
        if (guppy != null) {
            guppiesInPool.add(guppy);
        }
    }
    /**
     * Returns the Pool's Guppy population.
     *
     * @return population an int
     */
    public int getPopulation() {
        return guppiesInPool.size();
    }
    /**
     * Calculates which Guppies have died of malnutrition and returns
     * the number of Guppies that have died. The dead Guppies are NOT
     * removed from the Pool. They are only killed. They still need
     * to be removed from the Pool.
     *
     * @return numberStarved the number of Guppies that have died of starvation
     */
    public int applyNutrientCoefficient() {
        int numberStarved = 0;
        Iterator <Guppy> iterator = guppiesInPool.iterator();
        while (iterator.hasNext()) {
            Guppy guppy = iterator.next();
            if (guppy.getIsAlive() == true && randomNumberGenerator.nextDouble() > getNutrientCoefficient()) {
                guppy.setIsAlive(false);
                numberStarved++;
            }
        }
        return numberStarved;
    }
    /**
     * Removes (culls) the dead Guppies from this Pool and returns
     * the number that have been removed from this Pool.
     *
     * @return numberRemoved the number of dead Guppies removed.
     */
    public int removeDeadGuppies() {
        int numberRemoved = 0;
        Iterator <Guppy> iterator = guppiesInPool.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getIsAlive() == false) {
                iterator.remove();
                numberRemoved++;
            }
        }
        return numberRemoved;
    }
    /**
     * Returns the total volume requirement in litres of the living Guppies
     * in this Pool. Guppies know how many *millilitres* they require. This
     * returns total Litres where 1,000.0 mL = 1.0 L.
     *
     * @return totalVolumeLitres a double
     */
    public double getGuppyVolumeRequirement() {
        double totalVolumeInMillilitres = 0.0;
        Iterator <Guppy> iterator = guppiesInPool.iterator();
        while (iterator.hasNext()) {
            Guppy aPoolGuppy = iterator.next();
            if (aPoolGuppy.getIsAlive() == true) {
                totalVolumeInMillilitres += aPoolGuppy.getVolumeNeeded();
            }
        }
        return totalVolumeInMillilitres / 1000;
    }
    /**
     * Returns the average age in weeks of the living Guppies in this Pool.
     *
     * @return averageAgeInWeeks a double
     */
    public double getAverageAge() {
        double totalAge = 0.0;// Use a double here to force the compiler to return a double
        int numberOfLivingGuppies = 0;
        Iterator <Guppy> iterator = guppiesInPool.iterator();
        while (iterator.hasNext()) {
            Guppy aPoolGuppy = iterator.next();
            if (aPoolGuppy.getIsAlive() == true) {
                numberOfLivingGuppies++;
                totalAge += aPoolGuppy.getAgeInWeeks();
            }
        }
        return totalAge / numberOfLivingGuppies;
    }
    /**
     * Returns the average health coefficient of the living Guppies in this Pool.
     * A health coefficient is always contained within the range [MINIMUM_NUTRIENT_COEFFICIENT, MAXIMUM_NUTRIENT_COEFFICIENT].
     *
     * @return averageHealthCoefficient as a double
     */
    public double getAverageHealthCoefficient() {
        double totalHealthCoefficient = 0.0;
        int numberOfLivingGuppies = 0;
        Iterator <Guppy> iterator = guppiesInPool.iterator();
        while (iterator.hasNext()) {
            Guppy aPoolGuppy = iterator.next();
            if (aPoolGuppy.getIsAlive() == true) {
                numberOfLivingGuppies++;
                totalHealthCoefficient += aPoolGuppy.getHealthCoefficient();
            }
        }
        return totalHealthCoefficient / numberOfLivingGuppies;
    }
    /**
     * Returns the percentage of Guppies in this Pool that are female.
     *
     * @return percentageFemale as a double
     */
    public double getFemalePercentage() {
        double females = 0.0;
        int numberOfLivingGuppies = 0;
        Iterator <Guppy> iterator = guppiesInPool.iterator();
        while (iterator.hasNext()) {
            Guppy aPoolGuppy = iterator.next();
            if (aPoolGuppy.getIsAlive() == true) {
                numberOfLivingGuppies++;
                if (aPoolGuppy.getIsFemale() == true) {
                    females += 1.0;
                }
            }
        }
        return females / numberOfLivingGuppies;
    }
    /**
     * Returns the median age in weeks of the living Guppies in this Pool.
     *
     * @return medianAge as a double
     */
    public double getMedianAge() {
        double median = 0.0;
        double place;
        Iterator<Guppy> iterator = guppiesInPool.iterator();
        while (iterator.hasNext()) {
            Guppy aPoolGuppy = iterator.next();
            if (aPoolGuppy.getIsAlive()) {

            }
        }
        return median;
    }
    /**
     * Returns a description of this Pool.
     *
     * @return description of this Pool as a String.
     */
    public String toString() {
        return "[name=" + getName() + ",id=" + getIdentificationNumber() + ",volume (litres)=" + getVolume() +
                ",Temperature (Celsius): " + getTemperature() + ",pH: " + getPH() + ",Nutrient Coefficient: " +
                getNutrientCoefficient() + ",Guppy population: " + guppiesInPool.size() + "]";
    }
    /**
     * Prints this Pool's details.
     */
    public void printDetails() {
        System.out.println(this.toString());
    }
    /**
     * Formats a name and returns it with the first letter in upper case and the
     * rest in lower case. If passed null, returns a null.
     *
     * @param name the name to format
     * @return the correctly formatted name, as a String
     */
    public static String formatNameTitleCase(String name) {
        if (name != null && name.trim().length() > 0) {
            String firstLetter = name.trim().toUpperCase().substring(0, 1);
            String theRest = name.trim().toLowerCase().substring(1);
            return firstLetter + theRest;
        } else {
            return null;
        }
    }

    public int spawn(){
        Iterator<Guppy> itr = guppiesInPool.iterator();
        int newBorn=0;
        while(itr.hasNext()) {
            ArrayList<Guppy> newBabies=itr.next().spawn();
            newBorn+=newBabies.size();
            guppiesInPool.addAll(newBabies);
        }
        return newBorn;
    }
    public int incrementAges(){
        Iterator<Guppy> itr = guppiesInPool.iterator();
        int deadGp=0;
        while(itr.hasNext()) {
            Guppy g=itr.next();
            g.incrementAge();
            if(g.getAgeInWeeks()>=50) deadGp++;
        }
        return deadGp;
    }

    public int adjustForCrowding () {
        int result = 0;
        while ( getGuppyVolumeRequirement() >= getVolume()) {
            Iterator<Guppy> iterator = guppiesInPool.iterator();
            Guppy deadGuppy = new Guppy();
            double least = Guppy.MAXIMUM_HEALTH_COEFFICIENT;
            while(iterator.hasNext()) {
                Guppy g = iterator.next();
                if(g.getHealthCoefficient() < least){
                    deadGuppy = g;
                }
            }
            deadGuppy.setIsAlive(false);
            result++;
        }


        return result;
    }

}