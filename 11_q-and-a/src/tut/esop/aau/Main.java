package tut.esop.aau;

public class Main {

    static int getFactorial(int n) {
        if (n <= 1)
            return 1;

        return n * getFactorial(n-1);
    }

    static boolean isPalindrome(String str) {
        if(str.length() <= 1) return true;

        return str.charAt(0) == str.charAt(str.length() - 1) && isPalindrome(str.substring(1, str.length()-1));
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(3));
        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome("bla"));
        System.out.println(isPalindrome("ssass"));
    }
}
