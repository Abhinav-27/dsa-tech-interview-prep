package basics.maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        if (N<0 || (N!=0 && N%10==0)) {
            System.out.println(false);
        } else {
            System.out.println(reverseNumber(N) == N);
        }
    }

    private static int reverseNumber(int n) {
        int reverseNumber = 0;
        while (n != 0) {
            reverseNumber = reverseNumber * 10 + n % 10;
            n = n / 10;
        }
        return reverseNumber;
    }
}
