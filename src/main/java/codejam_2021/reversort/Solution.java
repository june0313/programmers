package codejam_2021.reversort;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] L = new int[N];
            for (int i = 0; i < N; i++) {
                L[i] = scanner.nextInt();
            }

            int cost = 0;
            for (int i = 0; i < N - 1; i++) {
                int j = findMinimumIndex(L, i);
                reverse(L, i, j);
                cost += (j - i + 1);
            }
            sb.append(String.format("Case #%d: %d\n", t + 1, cost));
        }

        System.out.println(sb);
    }

    private static int findMinimumIndex(int[] L, int startIndex) {
        int minValue = L[startIndex];
        int minIndex = startIndex;

        for (int i = startIndex; i < L.length; i++) {
            if (minValue > L[i]) {
                minValue = L[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    private static void reverse(int[] L, int i, int j) {
        int total = i + j;
        int middle = total / 2;
        for (int k = i; k <= middle; k++) {
            int temp = L[k];
            L[k] = L[total - k];
            L[total - k] = temp;
        }
    }
}
