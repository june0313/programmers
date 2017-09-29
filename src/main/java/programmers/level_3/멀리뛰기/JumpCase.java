package programmers.level_3.멀리뛰기;

class JumpCase {
    public int jumpCase(int num) {
        if (num < 3) return num;
        return jumpCase(num - 1) + jumpCase(num - 2);
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 4;
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.jumpCase(testCase));
    }
}
