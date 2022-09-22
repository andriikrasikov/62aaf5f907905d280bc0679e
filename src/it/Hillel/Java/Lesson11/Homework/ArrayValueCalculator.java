package it.Hillel.Java.Lesson11.Homework;

public class ArrayValueCalculator {
    private static int numbersSum = 0;

    public static int doCalc(String[][] data) {
        if (!(data.length == 4) || !(data[0].length == 4)) {
            throw new MyArraySizeException("Array size is not 4*4, current size is: " + data.length + "x" + data[0].length);
        } else {
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data.length; j++) {
                    try {
                        numbersSum += Integer.parseInt(data[i][j]);
                    } catch (NumberFormatException exception) {
                        throw new MyArrayDataException("Wrong type of cell contains cell: " + j + " " + i);
                    }
                }
            }
        }
        return numbersSum;
    }


}