package javaadvanced.oopAdv_1;

public class Dog extends Animal {
    private String breed;
    public Dog(double height, double weight, String breed) {
        super(height, weight);
        this.breed=breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "The breed is: " + breed + ", is weight is: " + getWeight() + " and is weight is: " + getWeight();
    }
    /**
    * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
    */

    public double runSpeedMetersPerSecond(Double height){
        double factorSpeed = 2.0;
        double speed = height*factorSpeed;

        return speed;
    }
}
