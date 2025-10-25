package w2;

public class MainLab{
    public static void main(String[] args){
        Node node1 = new Node(5);
        Node node2 = new Node(58);
        Node node3 = new Node(34);

        if (node1 == node2){
            System.out.println("same");
        }
        else
            System.out.println("diff");


        node1.next = node2;
        node2.next = node3;

        System.out.println(node1.data);
        System.out.println(node1.next.data);
        System.out.println(node1.next.next.data);

        Node head = new Node(1); // Head points to the first node in the list.
        System.out.println(head);
        Node tail = head; // Tail points to the last node in the list.

        for (int i = 0; i < 4; i++){
            tail.next = new Node(i*5);
            tail = tail.next;
        }

        Node cur = head; // temporary pointer
        while(cur != null){
            System.out.println(cur.data);
            cur = cur.next;
        }

        Node<Integer> n1 = new Node<Integer>(5);
        Node<Integer> n2 = new Node<Integer>(25);
        StackLL<Integer> stack1 = new StackLL<Integer>();
        stack1.push(n1);
        stack1.push(n2);
    }
}

class StackLL<T>{
    Node<T> head;
    StackLL(){
        head = null;
    }
    void push(Node<T> n){
        n.next = head;
        head = n;
    }
    Node<T> pop(){
        Node<T> h = head;
        head = head.next;
        return h;

    }
    Node<T> top(){
        return head;
    }
    boolean isEmpty(){
        return head == null;
    }
}

class Node<T>{
    int data;
    Node<T> next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}