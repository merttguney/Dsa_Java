package w4.Main;

public class Main {
    public static void main(String[] args) {
        /*

        IntNode n1 = new IntNode(66); // These are variables they are reference type.
        IntNode n2 = new IntNode(34);
        IntNode n3 = new IntNode(58);

        // Linked List manually creation
        n2.next = n3;
        n3.next = n1;


        */

        IntLL myLL = new IntLL();
        myLL.addFirst(45);
        myLL.addFirst(34);
        myLL.addLast(58);
        myLL.display();

    }
}

class IntLL{ // addFirst, addLast, display methods
    private IntNode head;
    IntLL(){
        this.head = null;
    }
    void addFirst(int data){
        IntNode nn = new IntNode(data);
        /*
        if(head == null)
            head = nn;
        else{
            nn.next = head;
            head = nn;
        }
         */

        nn.next = head;
        head = nn;
    }

    void addLast(int data){
        IntNode nn = new IntNode(data);
        IntNode curNode = head;
        while(curNode.next != null){
            curNode = curNode.next;
        }
        curNode.next = nn;


    }
    void display(){
        IntNode curNode = head;
        while(curNode != null){
            System.out.println(curNode.data);
            curNode = curNode.next;
        }
    }
}

class IntNode{
    int data;
    IntNode next;
    IntNode(int data){ // Constructor method
        this.data = data;
        this.next = null;
    }
}
