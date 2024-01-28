package arrays.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayIsSorted {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println(isSorted(arr, n));
    }

    private static boolean isSorted(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1]) return false;
        }
        return true;
    }
}
