package Seminar_03;

import java.util.ArrayList;
import java.util.List;

/**
 * Найти ближайшего общего предка двух узлов дерева.
 * Ограничение по памяти O(1)
 */
public class TreeNode {

    List<String> strings = new ArrayList<>();
TreeNode parent;
TreeNode left;
TreeNode right;
public TreeNode (TreeNode parent, TreeNode left, TreeNode right){
    this.parent = parent;
    this.left = left;
    this.right = right;

}
public TreeNode lowestCommonAncestor(TreeNode first, TreeNode second){
    return null;
}
}

