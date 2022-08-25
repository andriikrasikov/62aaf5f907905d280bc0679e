package ua.ithillel.javacourse.Lesson7;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobik");
        Cat cat = new Cat("Kitty");
        new Cat("Kitty2");
        new Dog("Bobik2");


        dog.run(140);
        dog.swim(200);

        cat.run(250);
        cat.swim(20);


        int countAnimal;
        countAnimal = Cat.getCountCat() + Dog.getCountDog();
        System.out.println("You have created " + Cat.getCountCat() + " cats and " + Dog.getCountDog() + " dogs, which are " + countAnimal + " animals.");

    }
}
