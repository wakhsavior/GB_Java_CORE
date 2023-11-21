package Seminar_04;

public interface ITest {
    static void test() {
        System.out.println("Статический метод");
    }

    default void testDefault(int a) {
        System.out.println("Число: " + a);
        testPrivate();
    }
    private void testPrivate(){
        System.out.println("Приватный");
    }
}
