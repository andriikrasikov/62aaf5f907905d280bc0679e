package ua.Ithillel.Java.Lesson8.Homework.Game;

public class Cat extends Competitor{
    private int maxLength;
    private int maxHeight;

    public Cat(String name, int maxLength, int maxHeight) {
        super(name);
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    public String getName() {
        return name;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public void run() {
        System.out.println(this.name + " is running(his max running length is "+ this.maxLength + " metres)");
    }

    public void jump() {
        System.out.println(this.name + " is jumping(his max jumping height is "+ this.maxHeight + " metres)");
    }



}

