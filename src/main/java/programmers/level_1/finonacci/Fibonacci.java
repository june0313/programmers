package programmers.level_1.finonacci;

public class Fibonacci {
    public long fibonacci(int num) {
        long a = 0;
        long b = 1;

        while (num - 2  > 0) {
            long sum = a + b;
            a = b;
            b = sum;
            num--;
        }

        return a + b;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Fibonacci c = new Fibonacci();
        int testCase = 3;
        System.out.println(c.fibonacci(testCase));
    }
}
