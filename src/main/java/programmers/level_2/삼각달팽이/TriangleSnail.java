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

    /**
     * 세로 -> 가로 -> 대각선 -> 세로 -> 가로 -> 대각선... 의 형태로 반복이 된다.
     * 이 때 채워야 하는 각 칸의 개수가 n 부터 0 까지 하나씩 줄어든다.
     * ex) n = 6, 세로(6) -> 가로(5) -> 대각선(4) -> 세로(3) -> 가로(2) -> 대각선(1) -> 세로(0)
     * 전체 n 번 반복 회차에 대한 인덱스를 i라고 하면 i를 3으로 나누었을때 나머지 값을 보면 어떤 방향으로 채워야 하는지 판단할 수 있다.
     *      n % 3 == 0 -> 세로
     *      n % 3 == 1 -> 가로
     *      n % 3 == 2 -> 대각선
     */
    public int[] solution2(int n) {
        int[][] triangle = IntStream.rangeClosed(1, n).mapToObj(int[]::new).toArray(int[][]::new);

        int y = -1;
        int x = 0;
        int number = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    y++;
                }
                if (i % 3 == 1) {
                    x++;
                }
                if (i % 3 == 2) {
                    y--;
                    x--;
                }
                triangle[y][x] = number++;
            }
        }

        return Arrays.stream(triangle).flatMapToInt(Arrays::stream).filter(i -> i > 0).toArray();
    }
}
