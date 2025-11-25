package w7;

import java.util.LinkedList;

public class mainFridayOffice {
    public static void main(String[] args) {
        BTNode root = new BTNode(1);
        BTNode two = new BTNode(2);
        BTNode three = new BTNode(3);
        BTNode four = new BTNode(4);
        BTNode five = new BTNode(5);
        BTNode six = new BTNode(6);
        BTNode seven = new BTNode(7);
        BTNode eight = new BTNode(8);

        root.left = two;
        root.right = four;
        two.left = three;
        four.right = five;
        five.right = six;
        six.left = seven;
        six.right = eight;

        int count = 0;
        count++;
        LinkedList<BTNode> list = new LinkedList<BTNode>();
        list.add(root);
        while (!list.isEmpty()){
            BTNode node = list.poll(); // Removes head from the list, print that console then.
            System.out.println(node.data);
            if(node.left != null) {
                list.add(node.left);
                count++;
            }
            if (node.right != null) {
                list.add(node.right);
                count++;
            }
        }
        System.out.println("number of nodes: " + count);
        System.out.println("rec(non): " + non(root));
    }
    static int non(BTNode node){
        if (node == null)
            return 0;
        return 1 + non(node.left) + non(node.right);
    }
}

class BTNode{
    int data;
    BTNode left, right;
    BTNode(int data){
        this.data = data;
        left = right = null;
    }
}