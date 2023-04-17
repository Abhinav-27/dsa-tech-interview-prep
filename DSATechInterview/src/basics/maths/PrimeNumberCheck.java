package basics.maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        System.out.println(N != 1 && isPrimeNumber(N));
    }

    private static boolean isPrimeNumber(int n) {
        for (int i = 2; i < (int) Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
