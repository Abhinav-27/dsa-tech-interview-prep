package basics.maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumberCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        System.out.println(isArmstrongNumber(N));
    }

    private static boolean isArmstrongNumber(int n) {
        int input = n, count = 0, temp = n;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, count);
            n /= 10;
        }
        return input == sum;
    }
}
