package basics.maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDigitsInNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        System.out.println(countDigitsUsingCounter(N));
        System.out.println(countDigitsUsingLog(N));
        System.out.println(countDigitsUsingStringConversion(N));
    }

    // Using Divide & counter approach but Time Complexity is O(n).
    private static int countDigitsUsingCounter(int n) {
        int count = 0;
        while (n != 0){
            n = n / 10;
            count++;
        }
        return count;
    }

    // Using Logarithmic approach where Time Complexity is O(1).
    private static int countDigitsUsingLog(int n) {
        return (int) Math.floor(Math.log10(n) + 1);
    }

    // Using Integer to String conversion approach where Time Complexity is O(1).
    private static int countDigitsUsingStringConversion(int n) {
        return Integer.toString(n).length();
    }
}
