package javaadvanced.oopAdv_2.exercise_oopAdv_2;

public class Circle extends Shape{
    public Circle(double height, double width) {
        super(height, width);

        if (height != 0){
            width = height;
        }

    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow((getHeight() / 2), 2);
    }
}
