package arrays.hard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SubarraysWithXorK {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println(noOfSubArraysWithXorK(arr, b));
    }

    private static int noOfSubArraysWithXorK(int[] arr, int b) {
        int n = arr.length;
        int count = 0, xor = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(xor, 1);

        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
            int x = xor ^ b;

            if (map.containsKey(x)) {
                count += map.get(x);
            }

            if (map.containsKey(xor)) {
                map.put(xor, map.get(xor)+1);
            } else {
                map.put(xor, 1);
            }
        }
        return count;
    }
}
