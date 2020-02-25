package testdome.user_input;

public class UserInput {

    public static class TextInput {
        private StringBuilder stringBuilder = new StringBuilder();

        public void add(char c) {
            stringBuilder.append(c);
        }

        public String getValue() {
            return stringBuilder.toString();
        }
    }

    public static class NumericInput extends TextInput {
        @Override
        public void add(char c) {
            if ('0' <= c && c <= '9') {
                super.add(c);
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}