package Seminar_03_HW;

import java.util.Random;

public class Main {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        Tree tree = new Tree();
        for (int i = 0; i < 20; i++) {
            tree.addTreeNode(rnd.nextInt(100));
        }

    }

}
