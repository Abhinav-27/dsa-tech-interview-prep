package basics.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class PalindromeRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        System.out.println(isPalindromeUsingIntStream(str));
    }

    private static boolean isPalindrome(String str, int i) {
        if (i >= str.length()/2) return true;
        if (str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        return isPalindrome(str, i+1);
    }

    // Find Palindrome using Stream API
    private static boolean isPalindromeUsingIntStream(String text) {
        String temp = text.replaceAll("//s", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() -i -1));
    }
}
