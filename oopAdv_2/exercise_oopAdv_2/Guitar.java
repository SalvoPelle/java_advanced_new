package javaadvanced.oopAdv_2.exercise_oopAdv_2;

public class Guitar extends Instrument{
    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public String play() {
        return "Strang Strang";
    }
}
