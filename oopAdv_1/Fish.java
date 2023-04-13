package javaadvanced.oopAdv_1;

public class Fish extends Animal{
    private String species;

    public Fish(double height, double weight, String species) {
        super(height, weight);
        this.species=species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "The species is: " + species + ", is weight is: " + getWeight() + " and is weight is: " + getWeight();
    }

    /**
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     */
    public double swimSpeedMetersPerSecond(Double weight){
        double factorSpeed = 2.0;
        double speed = weight*factorSpeed;

        return speed;
    }

}
