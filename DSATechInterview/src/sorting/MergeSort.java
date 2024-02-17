package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        mergeSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> result = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                result.add(arr[left]);
                left++;
            } else {
                result.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            result.add(arr[left]);
            left++;
        }

        while (right <= high) {
            result.add(arr[right]);
            right++;
        }

//        arr = result.stream()
//                .mapToInt(value -> value)
//                .toArray();

        for (int i = low; i <= high; i++) {
            arr[i] = result.get(i-low);
        }
    }
}
