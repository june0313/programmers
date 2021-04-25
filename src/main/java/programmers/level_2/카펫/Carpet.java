package programmers.level_2.카펫;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42842
 */
public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;

        for (int width = 3; width <= area / 3; width++) {
            int height = area / width;
            if ((width >= height) && ((height + width) * 2) - 4 == brown) {
                answer[0] = width;
                answer[1] = height;
                break;
            }
        }

        return answer;
    }
}
