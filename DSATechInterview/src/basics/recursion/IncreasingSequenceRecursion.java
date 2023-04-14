package basics.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IncreasingSequenceRecursion {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        recurse(1, N);
    }

    private static void recurse(int stub, int N){
        if (stub > N) return;
        System.out.print(stub + " ");
        recurse(stub+1, N);
    }
}
