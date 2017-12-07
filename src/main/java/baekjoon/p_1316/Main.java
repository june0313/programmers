package baekjoon.p_1316;

import java.util.*;

/**
 * 그룹 단어 체커
 * <p>
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
 * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<String> words = new ArrayList<>();
        while(n-- > 0) {
            words.add(sc.nextLine());
        }

        long count = new Main().getGroupWordCount(words);
        System.out.println(count);
    }

    public long getGroupWordCount(List<String> words) {
        return words.stream().filter(this::isGroupWord).count();
    }

    private boolean isGroupWord(String word) {
        char previousChar = word.charAt(0);
        Set<Character> usedChar = new HashSet<>();

        for (char c : word.toCharArray()) {
            if (usedChar.contains(c) && c != previousChar) return false;
            usedChar.add(c);
            previousChar = c;
        }

        return true;
    }
}
