package ua.ithillel.homework;

import java.util.Random;
import java.util.Scanner;

public class massiveGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Guess what's interesting for dinner today!");
        System.out.println(wordGame(console.nextLine()).toLowerCase());
        console.close();
    }

    public static String wordGame(String puttext) {
        Scanner console = new Scanner(System.in);
        System.out.println("Print your guess");
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String secretWord = words[new Random().nextInt(words.length)];

        while (!secretWord.equals(puttext)) {
            char[] solution = new char[]{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
            for (int i = 0; i < Math.min(solution.length, puttext.length()); i++) {
                if (puttext.charAt(i) == secretWord.charAt(i)) {
                    solution[i] = puttext.charAt(i);
                    System.out.println(solution[i]);
                }
            }
            System.out.println("wrong");
            System.out.println("guessed letters position");
            System.out.println(String.valueOf(solution));
            System.out.println("Try again");
            puttext = console.nextLine().toLowerCase();
        }
        console.close();
        return "Ahahaha " + secretWord + " is all your dinner"; //married daily routine. Directed by ROBERT B. WEIDE.
    }
}
