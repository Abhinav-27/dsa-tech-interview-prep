package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        sortUsingSelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortUsingSelectionSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {
            int min = i;
            for (int j = i+1; j < len; j++) {
                if (arr[j]<arr[min]) {
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
