package programmers.highscorekit.level_2.전화번호목록;

public class Prefix {
    public boolean solution(String[] phoneBook) {
        for (int i = 0; i < phoneBook.length; i++) {
            for (int k = 0; k < phoneBook.length; k++) {
                if ( i == k) {
                    continue;
                }

                if (phoneBook[i].startsWith(phoneBook[k])) {
                    return false;
                }
            }
        }
        return true;
    }
}
