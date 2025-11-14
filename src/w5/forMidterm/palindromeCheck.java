package w5.forMidterm;

// Tüm kodların buraya geçirilip, sonradan örnekler tamamlanmalı.

public class palindromeCheck {
    public static void main(String[] args) {

    }

    // Recursive(Using String Indices)
    static boolean isPalindrome(String str, int low, int high){
        if(low >= high)
            return true;
        if (str.charAt(low) != str.charAt(high))
            return false;

        return isPalindrome(str, low+1, high-1);
    }

    // Iterative
    static boolean isPalindromeIter(String str){
        int low = 0;
        int high = str.length() - 1;
        while (low < high){ // Devam etme koşuludur aslında
            if (str.charAt(low) != str.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
}
