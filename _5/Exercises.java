package javaadvanced._5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercises {
    public static void main(String[] args) throws Exception {
//        exercise1();
//        exercise2();
//        exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     *    prints it's stack trace
     */
    private static void exercise1() throws IOException {
        System.out.println("Exercise 1: ");
        // Your code here
        // col primo run crea il file ed entra nel try, dal secondo run entra nel catch lanciando l'eccezione
        try {
            Files.createFile(Path.of("Test.txt"));
        }catch (IOException ioException){
            throw new IOException("File already exist");
        }

    }

    /**
     * 2:
     *
     * Write a try-catch block that attempts to open a file
     *
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() throws IOException {
        System.out.println("\nExercise 2: ");
        // Your code here

            String userInputFileName = "test-file.txt";

            try {
                Files.readString(Path.of(userInputFileName));
            } catch (IOException ioException) {
//                ioException.printStackTrace();
                throw new IOException("crea un file");

            }
//            throw new IOException("crea un file");

//            li scrivo entrambi perchè non so quale sarebbe il più appropriato


    }

    /**
     * 3:
     *
     * Write a try-catch block that attempts to parse a string as an integer.
     *
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3(){
        System.out.println("\nExercise 3: ");
        // Your code here
//          PROVA 1
//        try{
//            Integer.parseInt("house");
//        }catch (Exception numberFormatException){
//            System.out.println("non è possibile castare");
//        }

//      PROVA 2 E 3. come sopra scritta in tutti e 2 i modi perchè non so qual'è il più appropriato
        try{
            Integer.parseInt("house");
        }catch (NumberFormatException numberFormatException){
            throw new NumberFormatException("non è possibile castare una stringa in int");
//            numberFormatException.printStackTrace();
        }
//        throw new NumberFormatException("Hai fatto un errore");

    }

    /**
     * 4:
     *
     * Write a try block that around this print statement that attempts to divide 2 numbers
     *
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     *
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     *
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here

        Double num1 = 10.0;
        String num2AsString = "0.0";
//            System.out.println(num1/Double.parseDouble(num2AsString));
        Double result =  num1/Double.parseDouble(num2AsString);

        try{
            System.out.println(result);
        }catch (NumberFormatException numberFormatException){
             throw new NumberFormatException("non è possibile castare una stringa in double");
        }catch (Exception exception){   //non ho trovato DivideByZeroException. ho provato con Exception generico. non entra in questa condizione perchè entra
           if (result.isInfinite()){    //nel try dando risultato infinito. non so come risolvere questo
            System.out.println("non si può dividere per zero");
           }
        }

//         throw new DivideByZeroException()
//         Your catch blocks here

    }

}
