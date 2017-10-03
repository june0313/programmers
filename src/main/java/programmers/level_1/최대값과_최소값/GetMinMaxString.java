package programmers.level_1.최대값과_최소값;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetMinMaxString {
    public String getMinMaxString(String str) {
        List<Integer> integers = Arrays.stream(str.split(" "))
                .map(Integer::valueOf)
                .sorted()
                .collect(Collectors.toList());

        return integers.get(0) + " " + integers.get(integers.size() - 1);
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}
