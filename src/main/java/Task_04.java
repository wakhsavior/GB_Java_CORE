import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*

Задание 4
Задача: Написать функцию добавления
элемента в конец массива таким образом,
чтобы она расширяла массив при
необходимости.

 */
public class Task_04 {
    public static Random rnd = new Random();
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введить размер массива");
        int N = scn.nextInt();
        int[] array = generateArray(N);
        printArray(array);
        System.out.println("Введите число для добавления");
        int M = scn.nextInt();
        array = addElementToArray(array,M);
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

    public static int[] addElementToArray(int[] array, int elem) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);

        newArray[array.length] = elem;
        return newArray;
    }
}
