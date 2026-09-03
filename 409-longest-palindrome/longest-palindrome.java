import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        
        // Count frequencies of each character
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        
        int length = 0;
        boolean hasOdd = false;
        
        // Calculate palindrome length
        for (int count : counts.values()) {
            length += (count / 2) * 2; // Add matching pairs
            if (count % 2 == 1) {
                hasOdd = true; // Mark if at least one odd count exists
            }
        }
        
        // Add 1 for the center character if an odd frequency was present
        if (hasOdd) {
            length += 1;
        }
        
        return length;
    }
}