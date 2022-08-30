package ua.Ithillel.Java.Lesson8.Homework.Game;

public class Human implements Competitor {
    private String name;
    private int maxRunningLength;
    private int maxJumpingHeight;

    public Human(int maxRunningLength, int maxJumpingHeight, String name) {
        this.name = name;
        this.maxRunningLength = maxRunningLength;
        this.maxJumpingHeight = maxJumpingHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRunningLength() {
        return maxRunningLength;
    }

    public void setMaxRunningLength(int maxRunningLength) {
        this.maxRunningLength = maxRunningLength;
    }

    public int getMaxJumpingHeight() {
        return maxJumpingHeight;
    }

    public void setMaxJumpingHeight(int maxJumpingHeight) {
        this.maxJumpingHeight = maxJumpingHeight;
    }

    @Override
    public void run() {
        System.out.print(this.name + " ran ");

    }

    @Override
    public void jump() {
        System.out.print(this.name + "has jumped ");

    }
}