package baekjoon.p_7469;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 현정이는 자료 구조 프로젝트를 하고 있다.
 * 다른 학생들은 프로젝트 주제로 스택, 큐와 같은 기본 자료 구조를 구현하는 주제를 선택했다.
 * 하지만, 현정이는 새로운 자료 구조를 만들었다.
 * <p>
 * 현정이가 만든 자료구조는 배열을 응용하는 것이다. 배열 a[1...n]에는 서로 다른 숫자가 n개 저장되어 있다.
 * 현정이는 여기에 Q(i,j,k)라는 함수를 구현해 모두를 놀라게 할 것이다.
 * <p>
 * Q(i,j,k): 배열 a[i...j]를 정렬했을 때, k번째 숫자를 리턴하는 함수
 * <p>
 * 예를 들어, a = (1,5,2,6,3,7,4)인 경우 Q(2,5,3)의 답을 구하는 과정을 살펴보자. a[2...5]는 (5,2,6,3)이고,
 * 이 배열을 정렬하면 (2,3,5,6)이 된다. 정렬한 배열에서 3번째 숫자는 5이다. 따라서 Q(2,5,3)의 리턴값은 5이다.
 * <p>
 * 배열 a가 주어지고, Q함수를 호출한 횟수가 주어졌을 때, 각 함수의 리턴값을 출력하는 프로그램을 작성하시오.
 */
public class Main {

    private static int[][] data;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        data = new int[n][2];

        for (int i = 1; i <= n; i++) {
            data[i - 1][0] = sc.nextInt();
            data[i - 1][1] = i;
        }

        Arrays.sort(data, Comparator.comparingInt(a -> a[0]));

        while (--m >= 0) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            q(i, j, k);
        }
    }

    private static void q(int i, int j, int k) {
        int c = 0;
        for (int[] aData : data) {
            if (aData[1] >= i && aData[1] <= j) {
                c++;
                if (c == k) {
                    System.out.println(aData[0]);
                    return;
                }
            }
        }
    }
}
