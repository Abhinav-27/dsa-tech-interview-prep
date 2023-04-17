package basics.maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDigitsInNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        System.out.println(countDigits(N));
    }

    private static int countDigits(int n) {
        int count = 0;
        while (n != 0){
            n = n / 10;
            count++;
        }
        return count;
    }
}
