package Seminar_02_HW;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Создать тип данных с методами удаления, добавления, получения случайного значения, поиска все операции O(1)
 */

public class RandomSet {
    /**
     * Для реализации можно использовать Map и List в Map ключем является значение, за значением местоположение в листе
     * С помощью Map нельзя реализовать рандомный доступ к элементам. Зато можно с помощью List путем выбора случайного
     * числа указывающего номер элемента
     */
    Map<Integer, Integer> map;
    List<Integer> list;
    Random rnd;

    public RandomSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rnd = new Random();
    }

    public void addElement(int elem) {
        if (!map.containsKey(elem)) {
            list.add(elem);
            map.put(elem, list.size()); // Можно использовать, на скорость не сказывается, скорее всего размер лежит как отдельная переменная в Коллекции

        }
    }

    public void delElement(int elem) {
        if (map.containsKey(elem)) {
            int currentPosition = map.get(elem);
            int lastElement = list.get(list.size() - 1);  // Можно использовать, на скорость не сказывается, скорее всего размер лежит как отдельная переменная в Коллекции
            list.set(currentPosition, lastElement);
            map.put(lastElement, currentPosition);
            list.remove(list.size() - 1);  // Можно использовать, на скорость не сказывается, скорее всего размер лежит как отдельная переменная в Коллекции
            map.remove(elem);

}
    }

    public boolean searchElem(int elem) {
        return map.containsKey(elem);
    }

    public int getRandomElem() {
        return list.get(rnd.nextInt(0, list.size()));
    }

    public void generateArray(int size) {
        for (int i = 0; i < size; i++) {
            addElement(rnd.nextInt(100));
        }
    }

    public static void main(String[] args) {
        int[] repeat = new int[]{100000, 1000000, 10000000, 100000000, 1000000000};
        for (int repeatCount : repeat) {
            RandomSet mySet = new RandomSet();
            mySet.generateArray(repeatCount);

            long time = timer(() -> {
                mySet.addElement(10);
            }, TimeUnit.NANOSECONDS);

            System.out.printf("Время выполнения добавления элемента при размере массива %d: " +
                    "%,9.3f ms\n", repeatCount, time/1_000_000.0);

            time = timer(() -> {
                mySet.searchElem(10);
            }, TimeUnit.NANOSECONDS);

            System.out.printf("Время выполнения поиска элемента при размере массива %d: " +
                    "%,9.3f ms\n", repeatCount, time/1_000_000.0);

            time = timer(() -> {
                mySet.getRandomElem();
            }, TimeUnit.NANOSECONDS);

            System.out.printf("Время выполнения доступа к случайному элементу при размере массива %d: " +
                    "%,9.3f ms\n", repeatCount, time/1_000_000.0);

            time = timer(() -> {
                mySet.delElement(10);
            }, TimeUnit.NANOSECONDS);

            System.out.printf("Время выполнения удаления элемента при размере массива %d: " +
                    "%,9.3f ms\n", repeatCount, time/1_000_000.0);
        }

    }

    /**
     * @param method метод для замера
     * @param timeUnit единица измерения
     * @return время работы
     */
    private static long timer(Runnable method, TimeUnit timeUnit) {
        long time = System.nanoTime();
        method.run();
        time = System.nanoTime() - time;
        return TimeUnit.NANOSECONDS.convert(time, timeUnit);
    }

}


