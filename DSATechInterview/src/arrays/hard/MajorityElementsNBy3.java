package arrays.hard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MajorityElementsNBy3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println(majorityElement(arr));
    }

    private static List<Integer> majorityElement(int[] arr) {
        int n = arr.length;
        int count1 = 0, count2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (count1 == 0 && ele2 != arr[i]) {
                count1 = 1;
                ele1 = arr[i];
            } else if (count2 == 0 && ele1 != arr[i]) {
                count2 = 1;
                ele2 = arr[i];
            } else if (ele1 == arr[i]) count1++;
            else if (ele2 == arr[i]) count2++;
            else {
                count1--;
                count2--;
            }
        }

        List<Integer> list = new ArrayList<>();

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < n; i++) {
            if (ele1 == arr[i]) count1++;
            if (ele2 == arr[i]) count2++;
        }

        int minimum = (n/3) + 1;

        if (count1 >= minimum) list.add(ele1);
        if (count2 >= minimum) list.add(ele2);

        return list;
    }
}
