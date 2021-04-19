package codejam_2021.moons_and_umbrellas;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        StringBuilder answer = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            String S = scanner.nextLine();

            int cost = calculateMinimumCost(X, Y, S);
            answer.append(String.format("Case #%d: %d\n", t + 1, cost));
        }

        System.out.println(answer);
    }

    public static int calculateMinimumCost(int X, int Y, String S) {
        if (S.contains("?")) {
            return Math.min(
                    calculateMinimumCost(X, Y, S.replaceFirst("\\?", "C")),
                    calculateMinimumCost(X, Y, S.replaceFirst("\\?", "J"))
            );
        }

        return calculateCost(X, Y, S);
    }

    public static int calculateCost(int X, int Y, String s) {
        int cost = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.startsWith("CJ", i)) {
                cost += X;
            }
            if (s.startsWith("JC", i)) {
                cost += Y;
            }
        }
        return cost;
    }
}
