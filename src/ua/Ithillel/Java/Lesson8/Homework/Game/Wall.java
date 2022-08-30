package ua.Ithillel.Java.Lesson8.Homework.Game;

public class Wall extends Obstacles{
    int height;
    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }



    public void setHeight(int height) {
        this.height = height;
    }
}
