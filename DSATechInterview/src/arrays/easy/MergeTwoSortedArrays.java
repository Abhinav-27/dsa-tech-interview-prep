package arrays.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int m = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Enter values for 1st array: ");
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println("Enter values for 2nd array: ");

        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(bufferedReader.readLine());
        }

        System.out.println(mergeTwoSortedArrays(arr1, arr2, n, m));
    }

    private static List<Integer> mergeTwoSortedArrays(int[] arr1, int[] arr2, int n, int m) {
        // Two pointers approach
        List<Integer> mergedList = new ArrayList<>();
        int i=0, j=0; // pointers

        while (i<n && j<m) {
            if (arr1[i] <= arr2[j]) {
                if (mergedList.isEmpty() || mergedList.getLast() != arr1[i]) {
                    mergedList.add(arr1[i]);
                }
                i++;
            } else {
                if (mergedList.isEmpty() || mergedList.getLast() != arr2[j]) {
                    mergedList.add(arr2[j]);
                }
                j++;
            }
        }

        while (i<n) {
            if (mergedList.getLast() != arr1[i]) {
                mergedList.add(arr1[i]);
            }
            i++;
        }

        while (j<m) {
            if (mergedList.getLast() != arr2[j]) {
                mergedList.add(arr2[j]);
            }
            j++;
        }
        return mergedList;
    }
}
