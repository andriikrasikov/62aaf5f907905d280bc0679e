package ua.Ithillel.Java.Lesson8.Homework.Figures;

public class Square implements Figure {
    final int numberOfSquareSides = 4;
    private final double s;

    public Square(double s) {
        this.s = s;
    }

    @Override
    public double getArea() {
        return s * s;
    }
}
