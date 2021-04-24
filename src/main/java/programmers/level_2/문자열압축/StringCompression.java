package programmers.level_2.문자열압축;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/60057
 */
public class StringCompression {
    public int solution(String s) {
        int finalAnswer = s.length();

        for (int pageSize = 1; pageSize <= s.length() / 2; pageSize++) {
            int offset = 0;
            int stepAnswer = s.length();

            while (offset + pageSize <= s.length()) {
                int numberOfSamePage = 1;

                String page = s.substring(offset, offset + pageSize);
                offset += pageSize;

                while (offset + pageSize <= s.length()) {
                    if (page.equals(s.substring(offset, offset + pageSize))) {
                        numberOfSamePage++;
                        offset += pageSize;
                    } else {
                        break;
                    }
                }

                if (numberOfSamePage > 1) {
                    stepAnswer -= (pageSize * (numberOfSamePage - 1));

                    if (numberOfSamePage < 10) stepAnswer += 1;
                    else if (numberOfSamePage < 100) stepAnswer += 2;
                    else if (numberOfSamePage < 1000) stepAnswer += 3;
                    else stepAnswer += 4;
                }
            }

            finalAnswer = Math.min(finalAnswer, stepAnswer);
        }

        return finalAnswer;
    }
}
