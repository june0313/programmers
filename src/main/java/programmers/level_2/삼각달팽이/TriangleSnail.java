package programmers.level_2.삼각달팽이;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/68645?language=java
 */
public class TriangleSnail {
    public int[] solution(int n) {
        int[][] triangle = IntStream.rangeClosed(1, n).mapToObj(int[]::new).toArray(int[][]::new);

        int max = (n * (n + 1)) / 2;
        int number = 1;
        int x = 0;
        int y = 0;

        triangle[x][y] = number;

        while (number < max) {
            while (y + 1 < n && number < max && triangle[y + 1][x] < 1) {
                y++;
                number++;

                triangle[y][x] = number;
            }

            while (x + 1 < n && number < max && triangle[y][x + 1] < 1) {
                x++;
                number++;

                triangle[y][x] = number;
            }

            while (y - 1 > 0 && x - 1 > 0 && number < max && triangle[y - 1][x - 1] < 1) {
                y--;
                x--;
                number++;

                triangle[y][x] = number;
            }
        }

        return Arrays.stream(triangle).flatMapToInt(Arrays::stream).toArray();
    }
}
