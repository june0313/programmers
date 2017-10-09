package programmers.level_1.str_to_int;

public class StrToInt {
    private static final char MINUS = '-';
    private static final char ZERO = '0';

    public int getStrToInt(final String str) {
        final boolean isNegative = isNegative(str);
        final int sign = isNegative ? -1 : 1;
        final String copiedStr = isNegative ? str.substring(1) : str;
        return sign * toInteger(copiedStr);
    }

    private boolean isNegative(String str) {
        return str.charAt(0) == MINUS;
    }

    private int toInteger(String str) {
        int result = 0;
        final int length = str.length();

        for (int i = 0; i < length; i++) {
            final int number = str.charAt(i) - ZERO;
            final double base = Math.pow(10, length - i - 1);
            result += (number * base);
        }

        return result;
    }

    //아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("-1234"));
    }
}
