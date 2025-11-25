package w8Midterm2_Prep.Question_6;

public class Main {
    public static void main(String[] args) {
        // Implement the pop method for a stack based on linked-list.
        // Design your IntStack class so that it will have only the required
        // data fields for only the pop method.
    }
}

class IntStack{
    private IntNode top;

    IntStack(){
        top = null; // stack is empty for initial condition
    }

    // Pop Method
    int pop(){
        // initially we can check is our Stack is empty or not
        // if it is empty we can throw an exception(IllegalState etc.)
        if (top == null) {
            throw new IllegalStateException("Stack is empty! Cannot pop.");
        }

        int value = top.data;
        top = top.next;
        return value;
    }
    // Other Stack methods
} // end of the stack

class IntNode{
    int data;
    IntNode next;

    IntNode(int data){
        this.data = data;
        this.next = null;
    }
}