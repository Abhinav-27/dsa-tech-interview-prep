package arrays.hard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println(Arrays.toString(printPascalTriangle(n)));
    }

    private static int[][] printPascalTriangle(int n) {
        // Write your code here.
        List<List<Integer>> pascalTriangleList = new ArrayList<>();

        if(n == 0) return convertTo2DArray(pascalTriangleList);

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        pascalTriangleList.add(firstRow);

        for (int i = 1; i < n; i++) {
            List<Integer> prevRow = pascalTriangleList.get(i-1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j-1) + prevRow.get(j));
            }

            currentRow.add(1);
            pascalTriangleList.add(currentRow);
        }
        return convertTo2DArray(pascalTriangleList);
    }

    private static int[][] convertTo2DArray(List<List<Integer>> lists){
        return lists.stream()
                .map(u  ->  u.stream()
                        .mapToInt(i->i)
                        .toArray())
                .toArray(int[][]::new);
    }
}
