package chapter05;

public class Challenge02 {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String text) {

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static int gcd(int a, int b) {
        int min = Math.min(a, b);

        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static String toBinary(int number) {
        String binary = "";
        int r;

        if (number == 0) {
            return "0";
        }

        while (number > 0) {
            r = number % 2;
            binary += r;
            number = number / 2;
        }
        return binary;
    }

    public static String compress(String text) {

        if (text == null || text.length() == 0) {
            return "";
        }

        String result = "";
        int i = 0;

        while (i < text.length()) {
            int j = i;
            while (j < text.length() && text.charAt(j) == text.charAt(i)) {
                j++;
            }
            result = result + text.charAt(i);

            int count = j - i;

            if (count > 1) {
                result = result + count;
            }

            i = j;
        }
        return result;
    }

    public static int gcdEuclid(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Prime");
        System.out.println(isPrime(11));
        System.out.println(isPrime(4));
        System.out.println("--------------------");

        System.out.println("Palindrome");
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("java"));
        System.out.println("--------------------");

        System.out.println("GCD");
        System.out.println(gcd(24, 36));
        System.out.println("--------------------");

        System.out.println("To Binary");
        System.out.println(toBinary(13));
        System.out.println("--------------------");

        System.out.println("GCD Eculidean Algorithm");
        System.out.println(gcdEuclid(24, 36));
        System.out.println(gcdEuclid(56, 42));
        System.out.println("--------------------");

        System.out.println("String Compression");
        System.out.println(compress("AAAABBBCCAAA"));
    }
}
