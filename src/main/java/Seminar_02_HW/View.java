package Seminar_02_HW;

import java.util.Random;
import java.util.Scanner;

public class View {
    public static Random rnd = new Random();
    public static Scanner scn = new Scanner(System.in);
    public int[] generateArray(int N){
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = rnd.nextInt(100);
        }
        return array;
    }

    public void printArray(Array array) {
        int[] curArray = array.getArray();
        int arrLength = curArray.length;
        for (int i = 0; i < arrLength; i++) {
            System.out.printf("%s \t", curArray[i]);
        }
        System.out.println();
    }

    public int requestInt(String str) {
        System.out.println(str);
        do {
            try {
                int N = scn.nextInt();
                return N;
            } catch (Exception e) {
                System.out.println("Ввод неверен, попробуйте заново: ");
            }
        } while (true);
    }
}
