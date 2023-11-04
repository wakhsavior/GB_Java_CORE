package Lecture_03;

import java.util.Date;
import java.util.Random;

public abstract class Animal {
    private static Random rnd = new Random();
    public static int count;
    private static final float variability = 0.25f;
    protected int id;
    protected String name;
    protected int birthYear;
    protected float maxJumpHeight;
    protected int maxRunLength;
    protected int maxSwimLength;

    {
        count++;
    }

    public int getId() {
        return id;
    }

    protected static int calculateAbility(int averageAbility) {
        return (int) (averageAbility * rnd.nextFloat(1 - variability, 1 + variability));
    }

    protected static float calculateAbility(float averageAbility) {

        return (averageAbility * rnd.nextFloat(1 - variability, 1 + variability));
    }

    public boolean run(int obstacle) {
        if (obstacle > maxRunLength) {
            return false;
        }
        return true;
    }

    public boolean swim(int obstacle) {
        if (obstacle > maxSwimLength) {
            return false;
        }
        return true;
    }


    public boolean jump(float obstacle) {
        if (obstacle > maxJumpHeight) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", maxRunLength=" + maxRunLength +
                ", maxSwimLength=" + maxSwimLength +
                ", maxJumpHeight=" + maxJumpHeight + "}";

    }
}
