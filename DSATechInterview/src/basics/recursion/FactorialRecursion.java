package basics.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialRecursion {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int factorial = fact(N);
        System.out.println(factorial);
    }

    private static int fact(int n) {
        if (n == 1) return 1;
        return n * fact(n-1);
    }
}
