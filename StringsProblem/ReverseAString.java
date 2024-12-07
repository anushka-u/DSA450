import java.util.*;
import java.util.stream.Collectors;

public class ReverseAString {

    public static void main(String[] args) {

//        String st = "I love India";
//        List<String> stringList = Arrays.asList(st.split(" "));
//        System.out.println(stringList);
//        List<String> rev = new ArrayList<>();
//        String result = "";
//        for (int i = stringList.size() - 1; i >= 0; i--) {
//            rev.add(stringList.get(i));
//        }
//        result = String.join(" ", rev);
//        System.out.println(result);


        String str = "racecar";
        HashMap<Character, Integer> countOcc = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (countOcc.containsKey(cur)) {
                countOcc.put(cur, countOcc.get(cur) + 1);
            } else {
                countOcc.put(cur, 1);
            }
        }
        countOcc.forEach((key, value) -> {
            System.out.println("Character: " + key + ", Count: " + value);
        });

        Optional<Character> result = str.chars()                           // Convert string to IntStream of characters
                .mapToObj(c -> (char) c)                                        // Convert IntStream to Stream<Character>
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))  // Group by character and count occurrences
                .entrySet()                                                     // Convert to Set of Map.Entry
                .stream()                                                       // Convert entry set back to stream
                .filter(entry -> entry.getValue() == 1)                          // Filter characters with count 1
                .map(Map.Entry::getKey)                                          // Extract the character from Map.Entry
                .findFirst();

        System.out.println(result.get());

        String st = "Anushka";
        System.out.println(st.chars().mapToObj(i->(char)i).filter(c->c=='a' || c=='A').count());

    }
}
