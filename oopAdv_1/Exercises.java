package javaadvanced.oopAdv_1;

public class Exercises {
    public static void main(String[] args) {
//        exercise1();
//        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters,
     * and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog dog=new Dog(0.55, 55, "Rottweiler");
        Dog dog1=new Dog(.25, 30, "French Bulldog");
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Fish fish=new Fish(1.00, 30, "Napoleon Fish");
        Fish fish1=new Fish(.10, .020, "Clownfish");

        Bird bird=new Bird(.45, 12, 1.50);
        Bird bird1=new Bird(.08, .035, .30);

    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog dog=new Dog(0.55, 55, "Rottweiler");
        System.out.println(dog + " and his speed is " + dog.runSpeedMetersPerSecond(dog.getHeight()) + " m/s");

//        Dog dog1=new Dog(.25, 30, "French Bulldog");
//        System.out.println(dog1 + " and his speed is " + dog1.runSpeedMetersPerSecond(dog1.getHeight()) + " m/s");

        Fish fish=new Fish(1.00, 30, "Napoleon Fish");
        System.out.println(fish + " and his speed is " + fish.swimSpeedMetersPerSecond(fish.getWeight()) + " m/s");

//        Fish fish1=new Fish(.10, .020, "Clownfish");
//        System.out.println(fish1 + " and his speed is " + fish1.swimSpeedMetersPerSecond(fish1.getWeight()) + " m/s");

        Bird bird=new Bird(.45, 12, 1.50);
        System.out.println(bird + " and his speed is " + bird.flySpeedMetersPerSecond(bird.getWingSpan()) + " m/s");

//        Bird bird1=new Bird(.08, .035, .30);
//        System.out.println(bird1 + " and his speed is " + bird1.flySpeedMetersPerSecond(bird1.getWingSpan()) + " m/s");

        if (dog.runSpeedMetersPerSecond(dog.getHeight())> fish.swimSpeedMetersPerSecond(fish.getWeight())
                && fish.swimSpeedMetersPerSecond(fish.getWeight())> bird.flySpeedMetersPerSecond(bird.getWingSpan())){
            System.out.println("L'animale più veloce è il cane");

        } else if (fish.swimSpeedMetersPerSecond(fish.getWeight()) > bird.flySpeedMetersPerSecond(bird.getWingSpan())
                && bird.flySpeedMetersPerSecond(bird.getWingSpan()) > dog.runSpeedMetersPerSecond(dog.getHeight())) {
            System.out.println("L'animale più veloce è il pesce");

        }else {
            System.out.println("L'animale più veloce è l'uccello");
        }


    }
}
