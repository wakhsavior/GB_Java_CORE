package Seminar_02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*

Задача: Написать метод, в который передается не пустой одномерный
целочисленный массив, метод должен вернуть true если в массиве есть
место, в котором сумма левой и правой части массива равны. Примеры:
checkBalance([1, 1, 1, || 2, 1]) → true,
checkBalance([2, 1, 1, 2, 1]) → false,
checkBalance([10, || 1, 2, 3, 4]) → true.
Абстрактная граница показана символами ||, эти символы в массив не
входят.

 */

public class Task_03 {
    public static Random rnd = new Random();
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Введить размер массива");
//        int N = scn.nextInt();
//        int[] array = generateArray(N);
//        printArray(array);

        int[] array = {1,1,7,-6,3};
        System.out.println(hasTwoPartsWithEqualSum(array));
        System.out.println(checkBalance(array));


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

    public static boolean hasTwoPartsWithEqualSum(int[] array) {
        int totalSum = Arrays.stream(array).sum();
        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            int rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                return true;
            }
//            else if (leftSum > rightSum) {
//                return false;
//            }
        }
        return false;
    }

    public static boolean checkBalance(int[] array) {
        int k = array.length - 2;
        int i = 1;
        int ls = array[0];
        int rs = array[k + 1];
        while (i < k) {
            if (ls < rs) {
                ls += array[i];
                i++;
            } else {
                rs += array[k];
                k--;
            }
        }
        return ls == rs;


    }

    private static boolean isBalanced(int[] arr, int pivot) {
        int leftSum = 0;
        int rightSum = 0;


        for (int i = 0; i < pivot; i++) {
            leftSum += arr[i];
        }


        for (int i = pivot; i < arr.length; i++) {
            rightSum += arr[i];
        }

        return leftSum == rightSum;
    }
}



