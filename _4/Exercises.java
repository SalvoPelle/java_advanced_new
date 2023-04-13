package javaadvanced._4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercises {

    private static final Path MY_PATH = Paths.get("file.txt");
    private static final Path PATH_IN_A_FOLDER = Paths.get("mydirectory/file.txt");

    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
        exercise5();
    }

    // Use the MY_PATH constant

    /**
     * 1:
     * Write a method that writes myString to a file
     * writes to a file
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        String myString = """
                The quick brown fox jumps over the lazy dog
                """;

        try {
//            Files.createFile(MY_PATH);
            // Your code here
            Files.writeString(MY_PATH, myString);
            System.out.println("File creato e scritto");

        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }

    }

    /**
     * 2:
     * Write a method that reads the file from exercise 1
     * then prints it out
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        try {
            // Your code here
            String stingContainText = Files.readString(MY_PATH);
            System.out.println(stingContainText);
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }


    }

     /**
     * 3:
     * Write a method that reads a file and print the number of lines in the file
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Write code here to read the file and return the number of lines "\n", string.split

        try {
            // Your code here
            String stringContainText = Files.readString(MY_PATH);
            String[] numberLines = stringContainText.split(" ");

            //così esce una sola riga. si usa lo split per aggiungere la stringa ad un array e poterlo iterare.

//            int i = 1;
//            for (String a : stringContainText.split(" ")){
//                if (a.equals("\n")){
//                    i++;
//                }
//            }
//            System.out.println(i);


            //così sto splittando le parole assegnando ad ogni parola una riga e contando il numero di righe che prendono

//            for (int i=0; i< numberLines.length; i++){
//                String x = numberLines[i];
//                System.out.println(i + " " + x);
//            }

        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 4:
     * Write a method that reads a file and returns the number of words in the file
     *
     * Then deletes the previous file with Files.delete() use inside the try block
     *
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");

        String newString = "Questa è una nuova stringa";

        try {
            // Your code here
            String stringContainText = Files.readString(MY_PATH);
            String[] numberLines = stringContainText.split(" ");

            int counter = 0;
            for (int i=0; i< numberLines.length; i++){
                String x = numberLines[i];
                System.out.println((i+1) + " " + x);
                counter ++;
            }
            System.out.println("Total= " + counter);

            Path path1 = Paths.get("newFile.txt");
            Files.writeString(path1, newString);
            String stingContainText1 = Files.readString(path1);
            System.out.println(stingContainText1);

            Files.delete(path1);

            if (Files.exists(path1)){
                System.out.println("non servi a nulla");
            }else {
                System.out.println("una volta tanto funzioni");
            }

        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 5:
     * Using the `myDirectoryPath` and Files.createDirectory, fix the code below
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        Path myDirectoryPath = Path.of("mydirectory");

        try {
            // Your code
            Files.createDirectories(myDirectoryPath);
            Files.writeString(PATH_IN_A_FOLDER, "Why am I in a folder?");
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }
}
