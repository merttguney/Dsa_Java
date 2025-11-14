package w5.forMidterm;

public class removeTargetOccurences {
    public static void main(String[] args) {

    }
    class IntNode{
        int data;
        IntNode next;
        IntNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Recursive
    static IntNode remove(int target, IntNode head){
        if (head == null)
            return null;

        head.next = remove(target, head.next);

        if (head.data == target)
            return head.next;

        return head;
    }

    // Iterative
    static IntNode removeIter(int target, IntNode head){
        while (head != null && head.data == target){
            head = head.next;
        }
        if (head == null)
            return null;

        IntNode current = head.next;
        IntNode prev = head;

        while (current != null){
            if (current.data == target)
                prev.next = current.next;
                current = prev.next;
                //else
                prev = current;
                current = current.next;

            return head;

        }
        return head;
    }
}
