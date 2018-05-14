package woowahan.exam3;

import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[10_001][10_001];

        for (int i = 1; i <= 3; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    matrix[y][x] = i;
                }
            }
        }

        int count = 0;

        for (int i = 1; i <= 10_000; i++) {
            for (int j = 1; j <= 10_000; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
