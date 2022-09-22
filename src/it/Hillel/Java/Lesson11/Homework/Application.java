package it.Hillel.Java.Lesson11.Homework;

public class Application {
    public static void main(String[] args) throws Throwable, MyArrayDataException, MyArraySizeException {


        String[][] array1= {
                {"1", "2", "3", "4"},
                {"5", "2", "7", "8"},
                {"9", "b", "113", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] array2= {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "a", "12"},
        };

        String[][] array3= {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "3", "12"},
                {"13", "3", "15", "3"}
        };



        System.out.println(ArrayValueCalculator.doCalc(array3));
        System.out.println(ArrayValueCalculator.doCalc(array1));
        System.out.println(ArrayValueCalculator.doCalc(array2));


    }
}
