package Seminar_02;

import java.util.Random;
import java.util.Scanner;

/*
Записать структуру данных, хранящую целые числа и поддерживающую следующие операции:
добавление значения в множество
проверка есть ли значение в множестве
удаление значения из множества
получение равномерно случайного значения из множества.
все операции O(1)
 */
public class Task_06 {
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
