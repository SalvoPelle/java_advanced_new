package javaadvanced.oopAdv_2;

public class Car implements NoiseMaker {
    @Override
    public String soundOfNoise() {
        return "Vroom";
    }

    @Override
    public double getDecimalsOfNoise() {
        return 0;
    }
}
