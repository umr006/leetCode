package PalindromeNumber;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        boolean result = false;
        if (x < 0 && x % 10 == 0) {
            result = false;
        }

        int orignalX = x;
        int reserseX = 0;

        while (x > 0) {
            reserseX = reserseX * 10 + x % 10;
            x /= 10;
        }

        return reserseX == orignalX;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }

}
