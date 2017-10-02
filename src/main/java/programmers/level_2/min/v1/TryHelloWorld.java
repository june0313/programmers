package programmers.level_2.min.v1;

import java.util.stream.IntStream;

class TryHelloWorld {
    public int getMinSum(int[] A, int[] B) {
        return getMinSum(A, B, A.length);
    }

    private int getMinSum(int[] A, int[] B, int n) {
        if (n == 0) {
            return IntStream.range(0, A.length).map(i -> A[i] * B[i]).sum();
        }

        int sum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            swap(B, i, n - 1);
            sum = Math.min(sum, getMinSum(A, B, n - 1));
            swap(B, i, n - 1);
        }

        return sum;
    }

    private void swap(int[] B, int i, int n) {
        int temp = B[i];
        B[i] = B[n];
        B[n] = temp;
    }

    public static void main(String[] args) {
        TryHelloWorld test = new TryHelloWorld();
        int[] A = {1, 2};
        int[] B = {3, 4};
        System.out.println(test.getMinSum(A, B));
    }
}
