package w4.MainLab;

public class MainLab {
    public static void main(String[] args) {

        IntLL myLL = new IntLL();
        myLL.addFirst(34);
        myLL.addFirst(58);
        myLL.addLast(6);
        myLL.display();

        System.out.println("***********************");
        myLL.display2();
        System.out.println("size " + myLL.size());
        System.out.println("sum " + myLL.sum());
    }
    static int fac(int n) {
        if (n == 0) return 1;
        return n * fac(n - 1);
    }
}

class IntLL{ // addFirst, addLast, display methods
    private IntNode head;
    IntLL(){
        head = null;
    }
    void addFirst(int data){
        IntNode nn = new IntNode(data);
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
    void display2(){
        display2Helper(head);
    }
    private void display2Helper(IntNode node){
        if (node != null){
            System.out.println(node.data);
            display2Helper(node.next);
        }
    }
    int size(){
        return sizeHelper(head);
    }
    private int sizeHelper(IntNode node){
        if (node == null)
            return 0;
        return 1 + sizeHelper(node.next);
    }
    int sum(){
        return sumHelper(head);
    }
    int sumHelper(IntNode node){
        if (node == null)
            return 0;
        return node.data + sumHelper(node.next);
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
