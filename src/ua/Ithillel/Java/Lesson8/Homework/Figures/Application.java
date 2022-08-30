package ua.Ithillel.Java.Lesson8.Homework.Figures;

 class Application {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(12);

        Triangle t1 = new Triangle(15, 2);
        Triangle t2 = new Triangle(16, 2);

        Square s1 = new Square(10);
        Square s2 = new Square(12);

        Figure[] figures = new Figure[]{c1, c2, t1, t2, s1, s2};

        System.out.printf("Figures total area is " + AreaSum(figures) + " sqm");
    }

    public static double AreaSum(Figure[] figures) {
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            sum = sum + figures[i].getArea();
        }
        return sum;
    }
}






