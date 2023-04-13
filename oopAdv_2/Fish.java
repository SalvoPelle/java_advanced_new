package javaadvanced.oopAdv_2;

public class Fish extends Animal {
    public Fish(double height, double weight) {
        super(height, weight);
    }

    @Override
    double calculateMovementSpeedMetersPerSecond() {
        return getWeight() * 2;
    }

    @Override
    public String soundOfNoise() {
        return "Blub blub";
    }

    @Override
    public double getDecimalsOfNoise() {
        return 0;
    }
}
