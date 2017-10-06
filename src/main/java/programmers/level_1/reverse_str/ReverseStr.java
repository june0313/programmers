package programmers.level_1.reverse_str;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ReverseStr {
    public String reverseStr(String str) {
        return Arrays.stream(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println(rs.reverseStr("Zbcdefg"));
    }
}
