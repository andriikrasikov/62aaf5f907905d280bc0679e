package ua.Ithillel.Java.Lesson8.Homework.Game;

public class Wall implements Obstacles {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Competitor competitor) {
        if (competitor.getMaxJumpingHeight() < height) {
            System.out.println(height + "-meters is too high barrier for " + competitor.getName());
            return false;
        } else {
            competitor.jump();
            System.out.println(" over a " + height + " meters wall");
        }
        return true;
    }
}
