package ua.Ithillel.Java.Lesson12.Homework11;

import java.util.Arrays;
import java.util.List;


public class Application {
    public static void main(String[] args) {

        List<String[][]> list = Arrays.asList(array1, array2, array3, array4, array5);

        for (Object s : list) {
            try {
                ArrayValueCalculator.doCalc((String[][]) s);
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println(e.getMessage());
                System.out.println("Exception was processed. Program continues");
            }
            System.out.println("Go program....");
            System.out.println("-----------------");
        }

    }


    static String[][] array1 = {
            {"1", "2", "3", "4"},
            {"5", "2", "7", "8"},
            {"9", "b", "113", "12"},
            {"13", "14", "15", "16"}
    };

    static String[][] array2 = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "a", "12"},
    };

    static String[][] array3 = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "3", "12"},
            {"13", "3", "15", "3"}
    };
    static String[][] array4 = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "3", "12"},
            {"13", "3", "15", "3"}
    };
    static String[][] array5= {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "3", "12"},
            {"13", "3", "15", "3"}
    };

}


