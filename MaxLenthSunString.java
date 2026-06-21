public class MaxLenthSunString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + length);
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        java.util.Set<Character> charSet = new java.util.HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            while (charSet.contains(currentChar)) {
                char leftChar = s.charAt(left);
                charSet.remove(leftChar);
                left++;
            }

            charSet.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
