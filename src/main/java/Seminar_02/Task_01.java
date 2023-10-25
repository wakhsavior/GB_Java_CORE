package Seminar_02;

import java.util.Random;
import java.util.Scanner;

/*

Задача: Задать одномерный массив. Написать методы поиска в нём
минимального и максимального элемента;

 */

public class Task_01 {
    public static Random rnd = new Random();
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введить размер массива");
        int N = scn.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = rnd.nextInt(0, 20);
        }
        printArray(array);
        System.out.println("min - "+findMin(array) +" max - " + findMax(array));
        System.out.println("minIndex - " + findMinIndex(array)+ " maxIndex - " + findMaxIndex(array));

    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMinIndex(int[] array) {

        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMaxIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s \t", array[i]);
        }
        System.out.println();
    }
}
