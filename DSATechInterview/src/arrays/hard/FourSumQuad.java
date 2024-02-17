package arrays.hard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumQuad {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println(findQuad(arr, n));
    }

    private static List<List<Integer>> findQuad(int[] arr, int target) {
        // using two-pointer approach
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i-1] == arr[i]) continue;

            for (int j = i+1; j < n; j++) {
                if (j > i+1 && arr[j-1] == arr[j]) continue;

                int k = j+1;
                int l = n-1;

                while (k<l) {
                    long sum = arr[i];
                    sum += arr[j];
                    sum += arr[k];
                    sum += arr[l];

                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        result.add(temp);
                        k++;
                        l--;

                        while (k < l && arr[k-1] == arr[k]) k++;
                        while (k < l && arr[l] == arr[l+1]) l--;
                    } else if (sum < target) {
                        k++;
                    } else l--;
                }
            }
        }
        return result;
    }
}
