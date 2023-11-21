package Seminar_04;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import java.util.function.Consumer;

public class Foo implements ITest {
    public static void main(String[] args) {
        ITest.test();
        var foo = new Foo();
        foo.testDefault(5);

        Runnable anonRun = new Runnable() {
            /*
            Создание экземпляра Абстрактного класса
             */
            @Override
            public void run() {
                System.out.println("Привет, анонимный класс!");
            }

        };
    /*
            Создание lambda функции на базе функционального интерфейса
             */
        Runnable lambdaRun = () -> {
            System.out.println("Привет, lambda!");
        };

        anonRun.run();
        lambdaRun.run();

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);

        list.forEach(new Consumer<Integer>() {
                         @Override
                         public void accept(Integer n) {
                             System.out.println(n * 5);
                         }
                     }
        );
        //или сокращенная в lambda запись

        list.forEach((n) -> {
                    System.out.println(n * 5);
                }
        );
        Class<Foo> classF = Foo.class;  //Обращение к объекту самого класса
        var foo2 = new Foo();

        //reflection

        Class<Foo> classF2 = (Class<Foo>)foo2.getClass();  //Обращение к объекту самого класса
        for (Method method: classF2.getDeclaredMethods()) {
            System.out.println(method.getName());
        }
    }

}
