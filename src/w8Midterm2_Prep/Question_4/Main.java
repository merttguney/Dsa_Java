package w8Midterm2_Prep.Question_4;

public class Main {
    public static void main(String[] args) {

    }
    boolean containsRec(int target, IntNode node){
        if (node == null) // empty or we went pass the last element(target not in list)
            return false;
        if (target == node.data)
            return true;
        return containsRec(target, node.next); // didn't find, keep searching.
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
