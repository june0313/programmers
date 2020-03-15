package programmers.level_2.가장큰수;

import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        return Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
                .reduce("", (s1, s2) -> s1.equals("0") && s2.equals("0") ? "0" : s1 + s2);
    }
}
