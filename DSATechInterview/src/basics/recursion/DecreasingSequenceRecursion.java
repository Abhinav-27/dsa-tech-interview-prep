package basics.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecreasingSequenceRecursion {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        recurse(N, 1);
    }

    private static void recurse(int N, int stub){
        if (N < stub) return;
        System.out.print(N + " ");
        recurse(N-1, stub);
    }
}
