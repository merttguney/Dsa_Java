package w3;

public class Main {
    public static void main(String[] args){
        int N = 5;
        int r = 1;

        while(N > 0){
            r = r*N;
            N--;
        }

        System.out.println("Factorial of N : " + r);
    }
}
