package javaadvanced.oopAdv_2.exercise_oopAdv_2;

public class Boat implements Movable{
    @Override
    public String moveForward() {
        return "Full speed ahead";
    }

    @Override
    public String moveBackward() {
        return "Back all the way";
    }
}
