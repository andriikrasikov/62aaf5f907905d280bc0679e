package ua.Ithillel.Java.Lesson8.Homework.Figures;

public class Triangle implements Figure {

     private final double th;
     private final double tb;

    public Triangle(double th, int tb) {
        this.th = th;
        this.tb = tb;
    }

    @Override
    public double getArea() {
        return (tb * th) * 0.5;
    }
}

