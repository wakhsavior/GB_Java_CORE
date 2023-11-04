package Lecture_03;

public class Dog extends Animal{
    private final int averageRunLenth = 500;
    private final float averageJumpHeight = 2.5f;
    private final int averageSwimLenght = 20;

    public Dog(String name, int year){
        this.id = Animal.count;
        this.name = name;
        this.birthYear = year;
        this.maxJumpHeight = Animal.calculateAbility(averageJumpHeight);
        this.maxRunLength =  Animal.calculateAbility(averageRunLenth);
        this.maxSwimLength = Animal.calculateAbility(averageSwimLenght);
    }

}
