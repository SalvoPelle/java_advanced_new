package javaadvanced.oopAdv_2.exercise_oopAdv_2;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     *
     * Create an abstract class called "Shape" with fields of height and width
     *
     * Create classes called "Rectangle" and "Circle" that extend the GeometricShape class and implement the calculateArea() method.
     *
     * Create instances of both and calculate their area
     *
     * To calculate the area copy the following code:  Math.PI * Math.pow((height / 2), 2)
     *
     * BONUS: Make sure the height and width values are exactly the same for Circle, change the constructor to do this
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        Circle circle = new Circle(6.0,0.0);

        System.out.println(rectangle.calculateArea());
        System.out.println(circle.calculateArea());
    }

    /**
     * 2:
     *
     *
     * Create an interface class called "Movable" that has the following methods: moveForward, moveBackward
     *
     * Create classes called "Car" and "Boat" that implement the Movable Interface
     *
     * Write code below that creates instances of both the Car and Boat class and demonstrates the use of the methods from the Movable interface.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Car car = new Car();
        Boat boat = new Boat();

        System.out.println(car.moveForward());
        System.out.println(car.moveBackward());

        System.out.println(boat.moveForward());
        System.out.println(boat.moveBackward());
    }

    /**
     * 3:
     *
     *
     * Create an interface called "Playable" with an abstract method called "play()".
     *
     * Create an abstract class called "Instrument" that implements the Playable interface and contains the fields "name" and "brand".
     *
     * Create classes called "Guitar" and "Piano" that extend the Instrument class and implement the play() method.
     *
     * Write code below that creates instances of both the Guitar and Piano class and demonstrates the use of the play() method.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Piano piano = new Piano("Bompiani", "Pooh");
        Guitar guitar = new Guitar("Ibanez", "Nickelback");

//        PROVA 1
//        System.out.println(piano.play());
//        System.out.println(guitar.play());

//        PROVA 2
        makeANoise(piano);
        makeANoise(guitar);
    }
    private static void makeANoise(Playable playable){
        System.out.println(playable.play());
    }
}
