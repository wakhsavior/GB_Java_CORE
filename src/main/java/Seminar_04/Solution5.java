package Seminar_04;

import java.util.Arrays;

public class Solution5 {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] tmpArray = Arrays.copyOf(array, array.length);
        Arrays.sort(tmpArray);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(tmpArray));
        System.out.println(Arrays.binarySearch(tmpArray,element)>0);

        //напишите тут ваш код
    }
}
