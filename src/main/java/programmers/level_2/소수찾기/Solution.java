package programmers.level_2.소수찾기;

import java.util.*;

public class Solution {
    private Set<Integer> allSubSet = new HashSet<>();

    public int solution(String numbers) {
        findAllPermutation("", numbers);
        return (int) allSubSet.stream().filter(this::isPrimeNumber).count();
    }

    private void findAllPermutation(String prefix, String postfix) {
        if (!prefix.equals("")) {
            allSubSet.add(Integer.valueOf(prefix));
        }

        for (int i = 0; i < postfix.length(); i++) {
            final String newPrefix = prefix + postfix.charAt(i);
            final String newPostfix = postfix.substring(0, i) + postfix.substring(i + 1);
            findAllPermutation(newPrefix, newPostfix);
        }
    }

    private boolean isPrimeNumber(Integer number) {
        if (number < 2) {
            return false;
        }

        if (number < 4) {
            return true;
        }

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
