package programmers.level_2.주식가격;

public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int k = i + 1; k < prices.length; k++) {
                answer[i] = k - i;
                if (prices[i] > prices[k]) {
                    break;
                }
            }
        }

        return answer;
    }
}
