package w2;// Stack => Pop, push(data), top => It only shows where the element is, isEmpty quizde sorulacak.
// package kullanılmasına bu aşamada gerek var mı?

public class Main {
    public static void main(String[] args) {
        IntStack s1 = new IntStack(32);
        s1.push(5);
        s1.push(34);
        s1.push(58);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}

class IntStack {
    private int numbers[];
    private int topIndex;
    IntStack(int size){
        numbers = new int[size];
        topIndex = -1;
    }
    int pop() {
        int value = numbers[topIndex];
        return value;
    }
    int top(){
        return numbers[topIndex];
    }
    void push(int data){
        topIndex++;
        numbers[topIndex] = data;
    }
    boolean isEmpty(){
        return topIndex == -1;
    }
}