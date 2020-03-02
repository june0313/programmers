package programmers.highscorekit.level_2.위장;

import java.util.*;

public class Spy {
    public int solution(String[][] clothes) {
        Map<String, Set<String>> clothesMap = new HashMap<>();

        for (String[] clothe : clothes) {
            clothesMap.putIfAbsent(clothe[1], new HashSet<>());
            clothesMap.get(clothe[1]).add(clothe[0]);
        }

        return clothesMap.values().stream().mapToInt(strings -> strings.size() + 1).reduce(1, (a, b) -> a * b) - 1;
    }
}
