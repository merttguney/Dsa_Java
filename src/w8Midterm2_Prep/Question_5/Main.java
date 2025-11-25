package w8Midterm2_Prep.Question_5;

public class Main {
    public static void main(String[] args) {
        // Counting all nums iterative way with our LinkedList class
    }

    int countIter(int target, IntNode head){
        int count = 0;
        IntNode curNode = head;
        while (curNode != null){
            if (curNode.data == target)
                count++;
                curNode = curNode.next;
        }
        return count;
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
