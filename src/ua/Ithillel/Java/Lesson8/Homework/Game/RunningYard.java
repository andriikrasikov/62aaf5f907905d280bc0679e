package ua.Ithillel.Java.Lesson8.Homework.Game;

public class RunningYard implements Obstacles {

    int length;

    public RunningYard(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Competitor competitor) {
        if (competitor.getMaxRunningLength() < length) {
            System.out.println(length + " meters is too long track for " + competitor.getName());
            return false;
        } else {
            competitor.run();
            System.out.println(length + " meters of track");
        }
        return true;

    }
}
