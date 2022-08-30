package ua.Ithillel.Java.Lesson8.Homework.Game;

public abstract class Competitor {
    static String name;

    public Competitor(String name) {
        Competitor.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void run();

    public abstract void jump();
}






