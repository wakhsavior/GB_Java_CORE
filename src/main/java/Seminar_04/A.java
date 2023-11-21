package Seminar_04;

import java.util.Iterator;

public class A implements Iterable<Integer> {
    private int foo;
    private Integer[] baz;

    public static void main(String[] args) {
        var iterator = new A().new MyIterator();
        iterator.next();

        var node = new A.Node();
    }
    public A() {
    }

    @Override
    public String toString() {
        class MLClass{

        }
        return super.toString();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }
    public class MyIterator implements Iterator<Integer>{
 /*
    Не существует без внешнего класса
    Обращается даже к приватным полям внешнего класса
    Внешний класс может видеть только не приватные методы
    Нужен для реализации логики под конкретный экземпляр класса
  */
        @Override
        public boolean hasNext() {
            System.out.println(foo);
            for (Integer i: baz){
                System.out.println(i);
            }
            return false;
        }

        @Override
        public Integer next() {
            return null;
        }
    }

    public static class Node{
        /*
        Работает только со статическими полями и методами внешнего  класса
        Может существовать в отрыве от внешнего класса
         */
    }
}
