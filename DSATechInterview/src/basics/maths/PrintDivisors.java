package basics.maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintDivisors {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        printDivisors(N);
    }

    private static void printDivisors(int n) {
        System.out.println("Divisors of " + n + " are: ");

        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n/i) System.out.println(n/i + " ");
            }
        }
        System.out.println();
    }
}
