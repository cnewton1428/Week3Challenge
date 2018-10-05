package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Week 3 Challenge- Simple Hangman

        Scanner input = new Scanner(System.in);
        ArrayList<String> guess = new ArrayList<>();
        System.out.println("Welcome! Let's play hangman!");

        guess.add("Tree");
        guess.add("Rain");
        guess.add("Bear");
        guess.add("Encourage");
        guess.add("Promise");
        guess.add("Soup");
        guess.add("Chess");
        guess.add("Insurance");
        guess.add("Pancakes");
        guess.add("Stream");

        System.out.println("Here is the word I am thinking of: ");

        String guess1 = "Tree";
        String[] splittedWord = guess1.split("");
        String [] word1 = new String [4];
        for (int index = 0; index < splittedWord.length; index++) {
            if (splittedWord[index].equalsIgnoreCase("T") || splittedWord[index].equalsIgnoreCase("r") || splittedWord[index].equalsIgnoreCase("e") || splittedWord[index].equalsIgnoreCase("e")) {
                System.out.println("_ ");
            } else {
                System.out.println(splittedWord[index] + "");
            }
        }

            for (String s = word1) {

            }
            int i = 1;
            do {
                System.out.println("Enter your guess:");
                String guessNow = input.nextLine();


                System.out.println("Your guess so far: ");
                System.out.println(guessNow);
                System.out.println();

                System.out.println("");

        }
            while (i <= 4) ;
            System.out.println("You have guessed incorrectly " + i + "/6 times");
            i++;

            //  Need an if splitWord/Phrase statement for printing all values including user input i.e. guessNow; including guess1

//            if (!guess1[i].equalsIgnoreCase("guessNow")) {
//                System.out.println("You have guessed incorrectly %f/6 times");
//            }else{
//                return;


            //Repeat for all 10 words

        }
    }
}





















//                }else {
//                    for (int j = 0; j< guess1.length; j++) {
//                    System.out.println("Your guess so far: ");
//                }
//            } while (true);
//        }
//    }
//}


//        String word1 = "Tree";
//
//        String[] word1Array = word1.split("");


//        for (int i = 0; i < word1Array.length; i++) {
//            if (word1Array[i].equalsIgnoreCase("T") || word1Array[i].equalsIgnoreCase("r") || word1Array[i].equalsIgnoreCase("e") || word1Array[i].equalsIgnoreCase("e")) {
//                System.out.println("_ _ _ _");





