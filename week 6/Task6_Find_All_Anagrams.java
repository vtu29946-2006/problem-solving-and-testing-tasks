import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (p.length() > s.length()) return result;

        int[] need = new int[26];
        int[] window = new int[26];

        for (char c : p.toCharArray()) need[c - 'a']++;

        int m = p.length();
        for (int i = 0; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;

            if (i >= m) {
                window[s.charAt(i - m) - 'a']--;
            }

            if (i >= m - 1 && Arrays.equals(need, window)) {
                result.add(i - m + 1);
            }
        }
        return result;
    }
}
