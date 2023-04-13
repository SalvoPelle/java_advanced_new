package javaadvanced.oopAdv_2.exercise_oopAdv_2;

public class Rectangle extends Shape{

    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    double calculateArea() {
        return getWidth()*getHeight();
    }
}
