package arrays.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) throws IOException {
        //int[] numbersArray = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::valueOf).toArray();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println(findLargestElementInAnArray(arr, n));
    }

    private static int findLargestElementInAnArray(int[] arr, int n) {
        int largestElement = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }
        return largestElement;
    }
}
