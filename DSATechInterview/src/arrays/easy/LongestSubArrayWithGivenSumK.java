package arrays.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestSubArrayWithGivenSumK {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        long k = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println(findLongestSubArray(arr, k));
    }

    private static int findLongestSubArray(int[] arr, long k) {
        int n=arr.length;
        long sum = arr[0];
        int maxLength=0;
        int left=0, right=0; // 2 pointers

        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            // if sum = k, update the maxLength i.e. answer
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }

            // Move forward the right pointer
            right++;
            if (right < n) sum += arr[right];
        }
        return maxLength;
    }
}
