package basics.maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        System.out.println(reverseNumber(N));
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
