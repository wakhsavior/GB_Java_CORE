package Lecture_04;
/*
Класс привязанный к методу. Local-method class
 */
public class Animal {
    void performBehavior(boolean state){
        class Brain{
            void sleep(){
                if(state){
                    System.out.println("Sleeping");
                }else {
                    System.out.println("Not sleeping");
                }
            }
        }
        Brain brain = new Brain();
        brain.sleep();
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.performBehavior(true);
    }
}
