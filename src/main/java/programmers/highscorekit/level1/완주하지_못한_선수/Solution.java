package programmers.highscorekit.level1.완주하지_못한_선수;

import java.util.*;

public class Solution {
    public String solution(String[] participants, String[] completions) {
        Map<String, Integer> participantMap = new HashMap<>();
        for (String participant : participants) {
            participantMap.putIfAbsent(participant, 0);
            participantMap.computeIfPresent(participant, (key, value) -> value + 1);
        }

        for (String completion : completions) {
            participantMap.computeIfPresent(completion, (key, value) -> value - 1);
        }

        return participantMap.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findAny()
                .orElseThrow(RuntimeException::new);
    }
}
