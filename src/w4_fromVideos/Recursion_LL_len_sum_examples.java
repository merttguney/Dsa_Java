package w4_fromVideos;

public class Recursion_LL_len_sum_examples {
    public static void main(String[] args) {
        IntNode head = null;
        IntNode n1 = new IntNode(34);
        IntNode n2 = new IntNode(58);
        IntNode n3 = new IntNode(17);
        n1.next = n2;
        n2.next = n3;
        head = n1;

        int size = 0; // iterative to finding the list size
        IntNode curNode = head;
        while (curNode != null){
            size++;
            curNode = curNode.next;
        }
        System.out.println("size " + size);

    }
    static int lenRec(IntNode node){
        if (node == null)
            return 0;
        return 1 + lenRec(node.next);
    }
    static int sumRec(IntNode node){
        if(node == null)
            return 0;
        return node.data + sumRec(node.next);
    }
}

class IntNode {
    int data;
    IntNode next;
    IntNode(int data){
        this.data = data;
        this.next = null;
    }
}
