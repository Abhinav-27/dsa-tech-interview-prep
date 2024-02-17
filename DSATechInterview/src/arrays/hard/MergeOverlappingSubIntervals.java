package arrays.hard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingSubIntervals {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[]{Integer.parseInt(bufferedReader.readLine())};
        }
        System.out.println(mergeOverlappingIntervals(arr));
    }

    private static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (list.isEmpty() || arr[i][0] > list.getLast().get(1)) {
                list.add(Arrays.asList(arr[i][0], arr[i][1]));
            } else {
                list.getLast().set(1, Math.max(list.getLast().get(1), arr[i][1]));
            }
        }
        return list;
    }
}
