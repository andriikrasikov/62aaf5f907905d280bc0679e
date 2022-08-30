package ua.Ithillel.Java.Lesson8.Homework.Game;

public class Application {
    public static void main(String[] args) {
        Human human1 = new Human("Robert", 10, 3);
        Robot robot1 = new Robot("Bender", 100, 2);
        Cat cat1 = new Cat("Kot Vasiliy", 100, 1);


        Competitor[] competitors = new Competitor[]{human1, robot1, cat1};

        RunningYard ry1 = new RunningYard(300);
        RunningYard ry2 = new RunningYard(200);
        Wall w1 = new Wall(2);
        Wall w2 = new Wall(3);

        Obstacles[] obstacles = new Obstacles[]{ry1, ry2, w1, w2};



            }

        }
    }


}

