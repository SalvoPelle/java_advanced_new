package javaadvanced._6;

public class Exercises {
    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

        for (Days a : Days.values()){
            System.out.println(a);
        }

    }

    private enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Season season = Season.SPRING;
        String seasonDuration = Season.SPRING.stardEndSeason;
        System.out.println(seasonDuration);

        season = Season.SUMMER;
        seasonDuration = Season.SUMMER.stardEndSeason;
        System.out.println(seasonDuration);

        season = Season.AUTUMN;
        seasonDuration = Season.AUTUMN.stardEndSeason;
        System.out.println(seasonDuration);

        season = Season.WINTER;
        seasonDuration = Season.WINTER.stardEndSeason;
        System.out.println(seasonDuration);
    }

    private enum Season{
        SPRING("From 22nd of March to 21st of June"),
        SUMMER("From 22nd of June to 21st of September"),
        AUTUMN("From 22nd of September to 21st of December"),
        WINTER("From 22nd of December to 21st of March");

        private String stardEndSeason;

        Season(String stardEndSeason) {
            this.stardEndSeason = stardEndSeason;
        }

        public String getStardEndSeason() {
            return stardEndSeason;
        }
    }

    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here

        // PROVA 1.
        TrafficLight behaviorColour = TrafficLight.RED;
        behaviorColour = TrafficLight.GREEN;
        switch (behaviorColour){
            case RED -> System.out.println(TrafficLight.YELLOW);
            case YELLOW -> System.out.println(TrafficLight.GREEN);
            case GREEN -> System.out.println(TrafficLight.RED);
        }

        // PROVA 2. VOLEVO CREARE UN CICLO CHE FUNZIONASSE ANCHE SE IMPLEMENTIAMO L'ENUM E CHE NON DIA ERRORE QUANDO L'INDEX EQUIVALE ALL'ULTIMO ELEMENTO.
//        String[] behaviorColour = new String[TrafficLight.values().length];
//        behaviorColour[0] = TrafficLight.RED.toString();
//        behaviorColour[1] = TrafficLight.YELLOW.toString();
//        behaviorColour[2] = TrafficLight.GREEN.toString();
//
//        String currentBehaviorColour = "GREEN";
//        String nextBehaviorColour = "";
//
//        for (int i=0; i< behaviorColour.length; i++){
//            if (i == behaviorColour.length-1 && currentBehaviorColour.equals(behaviorColour[i])){
//                nextBehaviorColour = behaviorColour[0];
//            }else if (currentBehaviorColour.equals(behaviorColour[i])){
//                nextBehaviorColour = behaviorColour[i+1];
//            }
//
//
//        }
//                System.out.println(nextBehaviorColour);

    }

    private enum TrafficLight{
        RED,
        YELLOW,
        GREEN;
    }

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        DaysOfWeek daysOfWeek = DaysOfWeek.MONDAY;
        daysOfWeek = DaysOfWeek.SATURDAY;
        if (daysOfWeek.isWeekend.equals(false)){
            System.out.println("Is a weekday. Let's go work");
        }else {
            System.out.println("Finally is weekend.let's go to the beach!!!");
        }

    }

    private enum DaysOfWeek {
        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(false),
        SATURDAY(true),
        SUNDAY(true);
        private Boolean isWeekend;

       DaysOfWeek(Boolean isWeekend) {
            this.isWeekend = isWeekend;
       }

       public Boolean getWeekend() {
            return isWeekend;
       }
    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     *
     * Scrivere un metodo che accetta due numeri interi e un valore Operatore come input,
     * esegue l'operazione corrispondente sugli interi e restituisce il risultato.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        Operator operation = Operator.ADD;
        operation = Operator.SUBSTRACT;

        double num1 = 5;
        double num2 = 2;
        int result = 0;

        switch (operation){
            case ADD -> result = (int) (num1 + num2);
            case SUBSTRACT ->  result = (int) (num1 - num2);
            case MULTIPLY ->  result = (int) (num1 * num2);
            case DIVIDE ->  result = (int) (num1 / num2);
        }
        System.out.println(result);

    }
     private enum Operator{
        ADD,
        SUBSTRACT,
        MULTIPLY,
        DIVIDE;

     }

}
