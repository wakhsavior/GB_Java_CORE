package Lecture_04;

/*
Статический подкласс класса Static Nested class
 */
public class Cat {
    private String name,color;
    private int age;
    public Cat(){}
    public Cat(String name, String color, int age){
        this.age = age;
        this.name = name;
        this.color = color;
    }
    static class Voice{
        private final int volume;
        public Voice(int volume){this.volume = volume;}
        public void sayMur(){
            System.out.printf("A cat purrs with volume %d\n", volume);
        }
    }

    public static void main(String[] args) {
        Cat.Voice voice = new Cat.Voice(100);
        voice.sayMur();
    }
}
