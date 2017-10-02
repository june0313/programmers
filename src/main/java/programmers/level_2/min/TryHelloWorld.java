package programmers.level_2.min;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

class TryHelloWorld {
    public int getMinSum(int[] A, int[] B) {
        Integer[] a = Arrays.stream(A).boxed().sorted().toArray(Integer[]::new);
        Integer[] b = Arrays.stream(B).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        return IntStream.range(0, A.length).map(i -> a[i] * b[i]).sum();
    }

    public static void main(String[] args) {
        TryHelloWorld test = new TryHelloWorld();
        int[] A = {1, 2};
        int[] B = {3, 4};
        System.out.println(test.getMinSum(A, B));
    }
}
