package ua.ithillel.javacourse.Lesson7;

public class Dog extends Animal {

    int maxRun = 500;
    int maxSwim = 10;
    String name;

    private static int countDog = 0;

    public Dog(String name) {
        super(name);
        this.name = name;
        setCountDog(getCountDog() + 1);
    }

    public static int getCountDog() {
        return countDog;
    }

    public static void setCountDog(int countDog) {
        Dog.countDog = countDog;
    }

    @Override
    public void run(int distanceRun) {
        if (distanceRun > 0 && distanceRun <= maxRun) {
            System.out.println(name + " just ran " + distanceRun + "m");
        } else if (distanceRun > maxRun) {
            System.out.println(name + " cannot run so long");
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public void swim(int distanceSwim) {
        if (distanceSwim > 0 && distanceSwim <= maxSwim) {
            System.out.println(name + " just swam " + distanceSwim + "m");
        } else if (distanceSwim > maxSwim) {
            System.out.println(name + " has sunk");
        } else {
            System.out.println("Error");
        }
    }
}


