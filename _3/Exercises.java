package javaadvanced._3;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


     /**
     * 1: Complete the function that removes any duplicates by using a set
     *    then recreates a new list of unique items
      *
      *   You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        // Your code here
        Set<String> newList = new HashSet<>();
        newList.addAll(list);

        list = new ArrayList<>();
        list.addAll(newList);


        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     *    the method should take a collection as a parameter
     */
    private static void exercise2() {
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");

        Set<String> set1 = toSet(list);
        Set<String> set2 = toSet(set);

        System.out.println(set1);
        System.out.println(set2);
    }

    // Write your method for exercise 2 here

    public static Set<String> toSet(Collection<String> collection){
    return new HashSet<>(collection);
    }

    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        // Your code here

        for (int i=0; i< words.size(); i++){
            //String word = words.get(i);
            int index = wordCount.getOrDefault(words.get(i), 0);
            wordCount.put(words.get(i), index+1);
        }

        System.out.println(wordCount);

        //System.out.println(indexCounter(words));


    }
    public static Map<String, Integer> indexCounter(List <String> collection){
        Map<String, Integer> indexNumber = new HashMap<>();

        for (int i=0; i< collection.size(); i++){
            String word = collection.get(i);
            int index = indexNumber.getOrDefault(word, 0);
            indexNumber.put(word, index+1);
        }

        return indexNumber;
    }

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer: List: perchè li aggiunge progressivamente dando loro una posizione. ogni volta che entra uno studente(viene aggiunto) prenderà una
     *    posizione e gli altri a seguire
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer: Map: usando la mappa li metterà in ordine dal voto più alto al più basso
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer:  Map: utilizzando come key l'età e come value le nazioni dalla più giovane
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer: Map: perchè possiamo abbinare il prodotto disponibile al prezzo
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer: List: stessa risposta al quesito 1
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer: Map: le città saranno le chiavi, la popolazione sarano i valori e saranno racchiusi dentro la mappa che prende il nome dello stato
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer: Map: ci da la possibilità di inserire o 2 chiavi e un valore o una chiave e più valori. si usa la MultiKeyMap.
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer: Map: ci da la possibilità di storare più valori in una sola posizione
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer: Map
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer: Map
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer: Map
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer: Map
     *
     */

}
