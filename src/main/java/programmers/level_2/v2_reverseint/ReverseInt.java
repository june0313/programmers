package programmers.level_2.v2_reverseint;

import java.util.*;

public class ReverseInt {
    public int reverseInt(int n){
        return String.valueOf(n).chars().mapToObj(c -> c - '0').sorted(Comparator.reverseOrder()).reduce(0, (acc, i) -> (acc * 10) + i);
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
}
