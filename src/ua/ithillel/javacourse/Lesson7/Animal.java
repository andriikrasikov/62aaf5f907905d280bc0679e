package ua.ithillel.javacourse.Lesson7;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(int distanceRun);

    public abstract void swim(int distanceSwim);
}


