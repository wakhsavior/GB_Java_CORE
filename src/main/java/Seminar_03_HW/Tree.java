package Seminar_03_HW;

import java.util.*;

public class Tree {
    private static Random rnd = new Random();
    private TreeNode root;
    private final List<TreeNode> listNodes;
    private int count;
    private final int LISTWIDTH = 120;

    public Tree() {
        this.listNodes = new ArrayList<>();
        this.count = 0;
        this.root = null;
    }

    public List<TreeNode> getListNodes() {
        return listNodes;
    }

    public int getCount() {
        return count;
    }
    public void addTreeNode(int value){
        addTreeNode(this.root,value);
    }

    public void addTreeNode(TreeNode node, int value) {
        if (node == null) {
            TreeNode newNode = new TreeNode(null, null, null);
            return;
        }
        switch (rnd.nextInt(2)) {
            case 0:
                if (node.left == null) {
                    TreeNode newNode = new TreeNode(node, null, null);
                    count++;
                    listNodes.add(newNode);
                    return;
                } else {
                    addTreeNode(node.left, value);
                }
                break;
            case 1:
                if (node.right == null) {
                    TreeNode newNode = new TreeNode(node, null, null);
                    count++;
                    listNodes.add(newNode);
                    return;
                } else {
                    addTreeNode(node.right, value);
                }
                break;
        }

    }
    public void printTree(){
        Queue<TreeNode> queueNodes = new LinkedList<>();
        boolean endTree = false;
        queueNodes.add(this.root);
        int level = 1;
        while(!endTree){
            endTree = true;
            for (TreeNode node:queueNodes) {

            }
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode first, TreeNode second) {
        int firstDeep = 0;
        int secondDeep = 0;
        TreeNode firstCurrentNode = first;
        TreeNode secondCurrentNode = second;
        while (firstCurrentNode != null) {
            firstCurrentNode = firstCurrentNode.parent;
            firstDeep++;
        }
        while (secondCurrentNode != null) {
            secondCurrentNode = secondCurrentNode.parent;
            secondDeep++;
        }
        firstCurrentNode = first;
        secondCurrentNode = second;
        while (firstCurrentNode != secondCurrentNode) {
            if (firstDeep > secondDeep) {
                firstCurrentNode = firstCurrentNode.parent;
                firstDeep--;
            } else {
                secondCurrentNode = secondCurrentNode.parent;
                secondDeep--;
            }
        }

        return firstCurrentNode;
    }
}
