package basics.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumRecursion {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int sum = sum(N);
        System.out.println(sum);
    }

    private static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n-1);
    }
}
