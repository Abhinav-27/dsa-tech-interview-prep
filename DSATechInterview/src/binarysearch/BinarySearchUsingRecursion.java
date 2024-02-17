package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(bufferedReader.readLine());
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println(binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {
        return recurseBinarySearch(arr, 0, arr.length-1, target);
    }

    private static int recurseBinarySearch(int[] arr, int low, int high, int target) {
        if (low > high) return -1;
        int mid = low + (high - low)/2;
        if (target == arr[mid]) return mid;
        else if (target < arr[mid]) {
            return recurseBinarySearch(arr, low, mid-1, target);
        } return recurseBinarySearch(arr, mid+1, high, target);
    }
}
