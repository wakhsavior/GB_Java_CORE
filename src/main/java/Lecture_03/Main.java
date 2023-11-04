package Lecture_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static Random rnd = new Random();

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Bird> birds = new ArrayList<>();

        for (int i = 0; i<3; i++) {
            Cat cat = new Cat("Barsik" + i, rnd.nextInt(2010, 2023));
            cats.add(cat);
        }
        for (int i = 0; i<3; i++) {
            Dog dog = new Dog("Palkan" + i, rnd.nextInt(2005, 2023));
            dogs.add(dog);
        }
        for (int i = 0; i<3; i++) {
            Bird bird = new Bird("Kanareika" + i, rnd.nextInt(2015, 2023));
            birds.add(bird);
        }
        float jumpHeight = rnd.nextFloat(3.0f);
        int swimLength = rnd.nextInt(22);
        int runLength = rnd.nextInt(550);

        System.out.println("Прыжок на " + jumpHeight + " метра");

        for (Cat cat : cats) {
            System.out.println(cat.toString() + ": " + cat.jump(jumpHeight) );
        }
        for (Dog dog : dogs) {
            System.out.println(dog.toString() + ": " + dog.jump(jumpHeight));
        }
        for (Bird bird : birds) {
            System.out.println(bird.toString() + ": " + bird.jump(jumpHeight));
        }

        System.out.println("Заплыв на " + swimLength + " метра");

        for (Cat cat : cats) {
            System.out.println(cat.toString() + ": " + cat.swim(swimLength) );
        }
        for (Dog dog : dogs) {
            System.out.println(dog.toString() + ": " + dog.swim(swimLength));
        }
        for (Bird bird : birds) {
            System.out.println(bird.toString() + ": " + bird.swim(swimLength));
        }
        System.out.println("Забег на " + runLength + " метра");

        for (Cat cat : cats) {
            System.out.println(cat.toString() + ": " + cat.run(runLength));
        }
        for (Dog dog : dogs) {
            System.out.println(dog.toString() + ": " + dog.run(runLength));
        }
        for (Bird bird : birds) {
            System.out.println(bird.toString() + ": " + bird.run(runLength));
        }

    }
}
