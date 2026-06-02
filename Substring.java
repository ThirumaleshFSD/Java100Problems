import java.util.*;

public class Substring {
    
    public String longestSubstringWithoutRepeatingCharacters(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        int maxStart = 0;

        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, end);

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }

        return s.substring(maxStart, maxStart + maxLength);
    }

    public static void main(String[] args) {
        Substring solution = new Substring();

        String s = "abcabcbb";

        String result = solution.longestSubstringWithoutRepeatingCharacters(s);

        System.out.println("The longest substring without repeating characters is: " + result);
    }
}