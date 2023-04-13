package javaadvanced.oopAdv_2;

public class Bird extends Animal {
    private double wingSpan;

    public Bird(double height, double weight, double wingSpan) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }

//    @Override
//    double calculateMovementSpeedMetersPerSecond() {
//        return this.wingSpan * 4;
//    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String soundOfNoise() {
        return "Squawk";
    }

    @Override
    public double getDecimalsOfNoise() {
        return 0;
    }

    @Override
    double calculateMovementSpeedMetersPerSecond() {
        return 0;
    }
}
