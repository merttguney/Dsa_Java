package w5.forMidterm;

public class starPattern {
    public static void main(String[] args) {

    }

    // Recursive
    static void printStars(int n){
        if (n == 0)
            return;

        for(int i = 0; i < n; i++){
            System.out.println("*");
        }
        System.out.println();
        printStars(n-1);
    }

    // Iterative
    static void printStarsIter(int N){
        for (int i = N; i >= 1; i--){ // Önce i'yi azaltırız j'de artmaya çalışır.
            for (int j = 0; j < i; j++){
                System.out.println("x");
            }
        }
        System.out.println();
    }

}
