package javaadvanced.oopAdv_2;

public class Main {
    public static void main(String[] args) {
        makeNoise(new Fish(0,0));
        makeNoise(new Car());
    }

    private static void makeNoise(NoiseMaker noiseMaker) {
        System.out.println(noiseMaker.soundOfNoise());
    }
}
