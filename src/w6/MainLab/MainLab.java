package w6.MainLab;

public class MainLab {
    public static void main(String[] args) {
        IntNode root = new IntNode(25);
        IntNode leftCh = new IntNode(10);
        IntNode rightCh = new IntNode(35);
        IntNode n45 = new IntNode(45);

        root.left = leftCh;
        root.right = rightCh;
        root.right.right = n45;

        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
        System.out.println(root.right.right.data);


        BT Tree = new BT();

        System.out.println("\nPre Order Print Results: ");
        Tree.preOrderPrint(root);

        System.out.println("\nIn Order Print Results: ");
        Tree.inOrderPrint(root);

        System.out.println("\nPost Order Print Results ");
        Tree.postOrderPrint(root);

    }
}

class BT{
    void preOrderPrint(IntNode n){
        if (n == null)
            return;
        System.out.println(n.data);
        preOrderPrint(n.left);
        preOrderPrint(n.right);
    }
    void inOrderPrint(IntNode n){
        if (n == null)
            return;

        preOrderPrint(n.left);
        System.out.println(n.data);
        preOrderPrint(n.right);
    }
    void postOrderPrint(IntNode n){
        if (n == null)
            return;

        preOrderPrint(n.left);
        preOrderPrint(n.right);
        System.out.println(n.data);
    }

}

class IntNode{
    int data;
    IntNode left;
    IntNode right;

    IntNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
