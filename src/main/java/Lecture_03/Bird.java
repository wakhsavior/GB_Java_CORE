package Lecture_03;

public class Bird extends Animal{
    private final int averageRunLenth = 200;
    private final float averageJumpHeight = 200f;
    private final int averageSwimLenght = 10;

    public Bird(String name, int year){
        this.id = Animal.count;
        this.name = name;
        this.birthYear = year;
        this.maxJumpHeight = Animal.calculateAbility(averageJumpHeight);
        this.maxRunLength =  Animal.calculateAbility(averageRunLenth);
        this.maxSwimLength = Animal.calculateAbility(averageSwimLenght);
    }

}
