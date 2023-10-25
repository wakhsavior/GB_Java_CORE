package Seminar_02;


import java.util.Random;
import java.util.Scanner;

/*
Задача: Написать метод, осуществляющий сортировку одномерного
массива подсчётом. Важное ограничение состоит в том, что для этой
сортировки диапазон значений исходного массива должен находиться в
разумных пределах, например, не более 1000.
x[2, 1, 0, 4, 3, 0, 0, 1, 2] → t[3(x0
), 2(x1
), 2(x2
), 1(x3
), 1(x4
)] → x[0, 0, 0, 1, 1, 2, 2, 3, 4]
 */
public class Task_05 {
    public static Random rnd = new Random();
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введить размер массива");
        int N = scn.nextInt();
        int[] array = generateArray(N);
        printArray(array);


    }
    public static int[] generateArray(int N) {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = rnd.nextInt(0, 20);
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s \t", array[i]);
        }
        System.out.println();
    }

}
