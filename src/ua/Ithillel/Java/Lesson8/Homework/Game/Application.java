package ua.Ithillel.Java.Lesson8.Homework.Game;

class Application {
    public static void main(String[] args) {
        Human human1 = new Human(100, 1, "Mr.Man");
        Robot robot1 = new Robot(100, 2, "Bender");
        Cat cat1 = new Cat(100, 5, "Mr.Cat");


        Competitor[] competitors = new Competitor[]{human1, robot1, cat1};

        RunningYard ry1 = new RunningYard(50);
        RunningYard ry2 = new RunningYard(50);
        Wall w1 = new Wall(2);
        Wall w2 = new Wall(3);

        Obstacles[] obstacles = new Obstacles[]{ry1, ry2, w1, w2};

        competition(competitors, obstacles);
    }

    public static void competition(Competitor[] competitors, Obstacles[] obstacles) {
        for (Competitor competitor : competitors) {
            for (Obstacles obstacle : obstacles) {
                if (!obstacle.overcome(competitor)) {
                    System.out.println(competitor.getName() + " did not pass an obstacle!");
                    System.out.println();
                    break;
                }


            }
        }
    }
}


