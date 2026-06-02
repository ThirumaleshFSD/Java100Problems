import java.util.*;
public class LogestSubstring{
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        Set<Character> uniqueChars = new HashSet<>();

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            if (!uniqueChars.contains(currentChar)) {
                uniqueChars.add(currentChar);
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                uniqueChars.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        LogestSubstring solution = new LogestSubstring();
        String input = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}