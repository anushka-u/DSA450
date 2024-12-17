package recursion.medium;

import java.util.*;

public class GeneratePermutationWithDuplicates {
    static Set<String> avoidDuplicate = new HashSet<>();

    public static void generatePermutation(String str, String temp, Map<Character, Integer> freqMap) {
        if (temp.length() == str.length()) {
            avoidDuplicate.add(temp);  // Add the unique permutation to the set
            return;
        }

        // Loop through the frequency map to create permutations
        for (char c : freqMap.keySet()) {
            if (freqMap.get(c) > 0) {  // Only use the character if it has remaining frequency
                // Choose this character, add it to the current temp string, and reduce the frequency
                freqMap.put(c, freqMap.get(c) - 1);
                generatePermutation(str, temp + c, freqMap);
                // Backtrack: restore the frequency
                freqMap.put(c, freqMap.get(c) + 1);
            }
        }
    }

    public static void main(String[] args) {
        String str = "aab";  // Example input
        // Create a frequency map of characters in the string
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        generatePermutation(str, "", freqMap);  // Start recursion with an empty temp string
        System.out.println(avoidDuplicate);  // Print the unique permutations
    }
}
