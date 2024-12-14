package recursion.medium;

public class ShortestWord {

    static int shortWordCount = Integer.MAX_VALUE;

    public static void shortestWordCount(String str, int idx, int count) {
        // Base case: if we've reached the end of the string
        if (idx == str.length()) {
            return;
        }

        // Start counting a word
        if (str.charAt(idx) != ' ') {
            count++;
        } else if (count > 0) { // Found a space and a word was counted
            // Compare the current word length with the shortest word length
            if (count < shortWordCount) {
                shortWordCount = count;
            }
            count = 0; // Reset count for the next word
        }

        // If we're at the end of the string and a word is still being counted, check it
        if (idx == str.length() - 1 && count > 0) {
            if (count < shortWordCount) {
                shortWordCount = count;
            }
        }

        // Recurse with the next character
        shortestWordCount(str, idx + 1, count);
    }

    public static void main(String[] args) {
        String str = "This is a test";
        shortestWordCount(str, 0, 0);
        System.out.println(shortWordCount); // Output will be 1, as 'a' is the shortest word
    }
}
