package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearchUsingIteration {
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
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (target == arr[mid]) return mid;
            else if (target < arr[mid]) {
                high = mid-1;
            } else low = mid+1;
        }
        return -1;
    }
}
