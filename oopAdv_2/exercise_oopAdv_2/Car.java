package javaadvanced.oopAdv_2.exercise_oopAdv_2;

public class Car implements Movable{
    @Override
    public String moveForward() {
        return "Go ahead!";
    }

    @Override
    public String moveBackward() {
        return "Go back";
    }
}
