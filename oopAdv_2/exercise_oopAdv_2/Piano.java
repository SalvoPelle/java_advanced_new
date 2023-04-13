package javaadvanced.oopAdv_2.exercise_oopAdv_2;

public class Piano extends Instrument{
    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public String play() {
        return "Plin Plan";
    }
}
