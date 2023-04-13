package javaadvanced.oopAdv_2.exercise_oopAdv_2;

abstract class Instrument  implements Playable{
    private String name;
    private String brand;

    public Instrument(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getBand() {
        return name;
    }

    public void setBand(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
