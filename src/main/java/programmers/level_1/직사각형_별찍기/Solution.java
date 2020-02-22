package programmers.level_1.직사각형_별찍기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            for (int k = 0; k < a; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
