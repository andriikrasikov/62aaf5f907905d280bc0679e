package it.Hillel.Java.Lesson11.Homework;

public class ArrayValueCalculator {
    public static int doCalc(String[][] values) {
        checkSize(values.length);
        for (String[] value : values) {
            checkSize(value.length);
        }
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                try {
                    sum += Integer.parseInt(values[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("A value of array is not parsable int.: [x:" + i + ",  y:" + j + "]", e);
                }

            }
        }
        return sum;
    }

    private static void checkSize(int length) {
        if (length != 4) {
            throw new MyArraySizeException("Array dimension must be 4x4");
        }
    }


}