package ua.ithillel.javacourse.Lesson7;

public class Cat extends Animal {

    String name;
    int maxRun = 200;
    int maxSwim = 0;
    private static int countCat = 0;

    public Cat(String name) {
        super(name);
        this.name = name;
        setCountCat(getCountCat() + 1);
    }

    public static int getCountCat() {
        return countCat;
    }

    public static void setCountCat(int countCat) {
        Cat.countCat = countCat;
    }

    @Override
    public void run(int maxRun) {
        if (maxRun > 0 && maxRun < 200) {
            System.out.println(name + " just ran " + maxRun + "m");
        } else if (maxRun > 200) {
            System.out.println(name + " cannot run so long");
        } else {
            System.out.println("Error");
        }


    }

    @Override
    public void swim(int distanceSwim) {
        System.out.println("You cat " + name + " has sunk");
    }
}