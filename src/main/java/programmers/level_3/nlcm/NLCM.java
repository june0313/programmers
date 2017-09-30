package programmers.level_3.nlcm;

import java.util.Arrays;

class NLCM {
    public long nlcm(int[] num) {
        return Arrays.stream(num).boxed().map(Long::valueOf).sorted().reduce(1L, (a, b) -> lcm(a, b));
    }

    private long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    private long gcd(long a, long b) {
        return (b % a == 0) ? a : gcd(b % a, a);
    }

    public static void main(String[] args) {
        NLCM c = new NLCM();
        int[] ex = {2, 6, 8, 14, 101};
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.nlcm(ex));
    }
}