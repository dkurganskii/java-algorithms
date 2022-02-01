package algo;

import org.junit.jupiter.api.Assertions;


public class FindClosestValueInBst {
    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBst(tree, target, tree.value);
    }

    public static int findClosestValueInBst(BST tree, int target, int closest) {
        BST currentNode = tree;
        while(currentNode != null){
            if(Math.abs(target - closest) > Math.abs(target - currentNode.value)){
                closest = currentNode.value;
            }if(target < currentNode.value){
                currentNode = currentNode.left;
            }else if(target > currentNode.value){
                currentNode = currentNode.right;
            }else{
                break;
            }
        }
        return closest;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        var root = new BST(10);
        root.left = new BST(5);
        root.left.left = new BST(2);
        root.left.left.left = new BST(1);
        root.left.right = new BST(5);
        root.right = new BST(15);
        root.right.left = new BST(13);
        root.right.left.right = new BST(14);
        root.right.right = new BST(22);

        var expected = 13;
        var actual = FindClosestValueInBst.findClosestValueInBst(root, 12);
       Assertions.assertEquals(expected, actual);
        if(expected == actual){
            System.out.println(actual);
        }else{
            System.out.println(expected);
        }
    }
}
