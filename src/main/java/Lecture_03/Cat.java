package Lecture_03;

import lombok.Getter;

public class Cat extends Animal{

    @Getter
    private final int averageRunLenth = 200;
    private final float averageJumpHeight = 2.0f;

    public Cat (String name, int year){
        this.id = Animal.count;
        this.name = name;
        this.birthYear = year;
        this.maxJumpHeight = Animal.calculateAbility(averageJumpHeight);
        this.maxRunLength =  Animal.calculateAbility(averageRunLenth);
        this.maxSwimLength = 0;
    }

    @Override
    public boolean swim(int obstacle) {
        System.out.printf("Коты не любят плавать: ");
        return false;
    }
}
