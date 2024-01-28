package arrays.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RightRotateByKPlace {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int k = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        rightRotateArrayByKPlace(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    private static void rightRotateArrayByKPlace(int[] arr, int k) {
        int len = arr.length;

        // Reverse first n-k elements
        reverse(arr, 0, len-k-1);

        // Reverse last k elements
        reverse(arr, len-k, len-1);

        // Reverse whole array
        reverse(arr, 0, len-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
