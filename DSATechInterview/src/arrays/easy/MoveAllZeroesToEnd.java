package arrays.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println(Arrays.toString(moveZeroesToTheEnd(arr, n)));
    }

    private static int[] moveZeroesToTheEnd(int[] arr, int n) {
        // Using 2 pointers approach
        int j = -1;
        // place the pointer j
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // no zero-elements
        if (j == -1) return arr;

        // Move the pointers i and j
        // and swap accordingly.
        for (int i = j+1; i < n; i++) {
            if (arr[i] != 0) {
                // swap arr[i] & arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}
