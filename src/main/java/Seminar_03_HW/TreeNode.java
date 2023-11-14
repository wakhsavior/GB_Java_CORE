package Seminar_03_HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Найти ближайшего общего предка двух узлов дерева.
 * Ограничение по памяти O(1)
 */
public class TreeNode {

    TreeNode parent;
    int value;

    public void setValue(int value) {
        this.value = value;
    }

    TreeNode left;
    TreeNode right;

    public TreeNode(TreeNode parent, TreeNode left, TreeNode right) {
        this.parent = parent;
        this.left = left;
        this.right = right;

    }

    @Override
    public String toString() {
        return  "\"" + value + "\"";
    }
}




