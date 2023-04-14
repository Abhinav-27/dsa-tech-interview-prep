package basics.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        reverseArray(array, 0, len-1);
        System.out.println(Arrays.toString(array));
    }

    private static void reverseArray(int[] array, int start, int end) {
        if (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            reverseArray(array, start+1, end-1);
        }
    }
}
