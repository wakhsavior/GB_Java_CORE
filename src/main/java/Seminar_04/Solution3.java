package Seminar_04;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = 0;
        while (!scn.hasNextInt()) {
            scn.nextLine();
        }
        N = scn.nextInt();
        scn.nextLine();
        multiArray = new int[N][];
        String numbers;
        for (int i = 0; i < N; i++) {
            multiArray[i] = new int[scn.nextInt()];
        }
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.printf(multiArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(multiArray));

    }
}
