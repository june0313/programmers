package programmers.level_2.reverseint;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReverseInt {
    public int reverseInt(int n){
        List<Integer> integers = new ArrayList<>();

        while(n > 0) {
            integers.add(n % 10);
            n /= 10;
        }

        return integers.stream()
                .sorted(Comparator.reverseOrder())
                .reduce(0, (acc, i) -> (acc * 10) + i);
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
}
