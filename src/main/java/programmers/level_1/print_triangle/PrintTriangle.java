package programmers.level_1.print_triangle;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintTriangle {
    public String printTriangle(int num){
        return IntStream.range(0, num)
                .boxed()
                .map(i -> IntStream.rangeClosed(0, i)
                        .boxed()
                        .map(x -> "*")
                        .collect(Collectors.joining())
                        .concat("\n"))
                .collect(Collectors.joining());
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        PrintTriangle pt = new PrintTriangle();
        System.out.println( pt.printTriangle(10) );
    }
}
