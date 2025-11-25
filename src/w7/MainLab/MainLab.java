package w7.MainLab;

public class MainLab {
    public static void main(String[] args) {
        IntLL list = new IntLL();
        list.addFirst(10);
        list.addFirst(5);
        list.addLast(20);
        list.addLast(30);

        list.display();
    }
}

// Create a Linked List class with only head pointer
// implement addFirst and addLast(iteration)

class IntLL {
    private IntNode head;

    IntLL() {
        head = null;
    }

    void addFirst(int data) {
        IntNode nn = new IntNode(data);
        nn.next = head;
        head = nn;
    }


    void addLast(int data) {
        IntNode nn = new IntNode(data);
        IntNode curNode = head;
        if (head == null){// list is empty
            head = nn;
            return;
        }
        while (curNode.next != null){
            curNode = curNode.next;
        }
        curNode.next = nn;
    }

    void addLast2(int data){
        addLastRecHelper(data, head);
    }

    void addLastRecHelper(int data, IntNode node){
        if (node == null)
            head = new IntNode(data);
        else if (node.next != null){
            addLastRecHelper(data, node.next);
        }
        else node.next = new IntNode(data);
    }

    void display() {
        IntNode curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " ");
            curNode = curNode.next;
        }
        System.out.println();
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
