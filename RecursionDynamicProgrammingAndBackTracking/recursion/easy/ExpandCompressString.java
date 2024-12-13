package recursion.easy;

public class ExpandCompressString {

    public static String expandString(String str, int idx) {
        if (idx >= str.length()) {
            return "";
        }

        char ch = str.charAt(idx);

        if (Character.isLetter(ch)) {
            int repeat = 1;

            // Check if the next character is a digit
            if (idx + 1 < str.length() && Character.isDigit(str.charAt(idx + 1))) {
                repeat = str.charAt(idx + 1) - '0';
                return ch + expandString(str, idx + 2).repeat(repeat - 1);
            }
            return ch + expandString(str, idx + 1);
        }
        return expandString(str, idx + 1);  // Skip invalid cases
    }

    public static void main(String[] args) {
        String str = "a3b2c4";
        System.out.println(expandString(str, 0));
    }
}
