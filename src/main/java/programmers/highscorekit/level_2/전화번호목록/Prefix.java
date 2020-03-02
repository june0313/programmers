package programmers.highscorekit.level_2.전화번호목록;

import java.util.*;

public class Prefix {
    public boolean solution(String[] phoneBook) {
        Set<String> set = new HashSet<>(Arrays.asList(phoneBook));

        for (String phoneNumber : phoneBook) {
            for (int i = 0; i < phoneNumber.length(); i++) {
                if (set.contains(phoneNumber.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }
}
