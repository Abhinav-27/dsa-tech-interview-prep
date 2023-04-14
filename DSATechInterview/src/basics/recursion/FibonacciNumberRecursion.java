package basics.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciNumberRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        System.out.println(findNthFibonacci(number));
    }

    private static int findNthFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return findNthFibonacci(n-1) + findNthFibonacci(n-2);
    }
}
