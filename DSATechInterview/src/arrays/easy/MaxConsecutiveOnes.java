package arrays.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxConsecutiveOnes {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println(findMaxConsecutiveOnes(arr, n));
    }

    private static int findMaxConsecutiveOnes(int[] arr, int n) {
        int count = 0, max = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            } else count = 0;
            max = Math.max(max, count);
        }
        return max;
    }
}
