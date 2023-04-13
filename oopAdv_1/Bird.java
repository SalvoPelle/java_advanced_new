package javaadvanced.oopAdv_1;

public class Bird extends Animal {

    private double wingSpan;


    public Bird(double height, double weight, double wingSpan) {
        super(height, weight);
        this.wingSpan=wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return "The height of this bird is: " + getHeight() + ", his weight is: " + getWeight() + ", the wing span is: " + wingSpan;
    }

    /**
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     */

    public double flySpeedMetersPerSecond(Double weight){
        double factorSpeed = 4.0;
        double speed = wingSpan*factorSpeed;

        return speed;
    }
}
