package programmers.skillcheck.level_1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem2 {
    public String solution(String[] seoul) {
        int kimIndex = Arrays.stream(seoul).collect(Collectors.toList()).indexOf("Kim");
        return "김서방은 " + kimIndex + "에 있다";
    }
}
