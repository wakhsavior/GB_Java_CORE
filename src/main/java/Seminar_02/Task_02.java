package Seminar_02;

import java.util.Random;
import java.util.Scanner;


/*

Задача: Создать квадратный целочисленный массив (количество строк и
столбцов одинаковое), заполнить его диагональные элементы единицами,
используя цикл(ы)

 */
public class Task_02 {
    public static Random rnd = new Random();
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введить размер двумерного массива");
        int N = scn.nextInt();
        int[][] array = new int[N][N];
        fillMatrixDiagonalsOnes(array);
        print2DArray(array);
    }
    public static void fillMatrixDiagonalsOnes(int[][] array){
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
    }

        public static void print2DArray ( int[][] array){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    System.out.printf("%s \t", array[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }

}
