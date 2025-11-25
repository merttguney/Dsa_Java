package w8Midterm2_Prep.Question_2;

public class Main {
    IntNode head;

    public static void main(String[] args) {

    }

    int get(int index){
        return getRec(index, 0, head);
    }
    int getRec(int index, int i, IntNode node){
        if (node == null)
            throw new IllegalStateException("empty or index out of bounds.");
        if (index == i)
            return node.data;

        return getRec(index, i + 1, node.next);
    }
}

class IntNode{
    int data;
    IntNode next;
    IntNode(int data){
        this.data = data;
        this.next = null;
    }
}
