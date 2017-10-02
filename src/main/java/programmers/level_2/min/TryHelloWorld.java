package programmers.level_2.min;

import java.util.Arrays;
import java.util.stream.IntStream;

class TryHelloWorld {
    public int getMinSum(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        return IntStream.range(0, A.length).map(i -> A[i] * B[B.length - i - 1]).sum();
    }

    public static void main(String[] args) {
        TryHelloWorld test = new TryHelloWorld();
        int[] A = {1, 2};
        int[] B = {3, 4};
        System.out.println(test.getMinSum(A, B));
    }
}
