import java.io.*;
import java.util.*;

public class Solution {
    // For each rotation, compute the longest palindromic substring
    // using center expansion. This is a straightforward solution.
    // It is suitable for understanding the problem, though not the
    // most efficient solution for the largest HackerRank constraints.

    static int longestPalindrome(String s) {
        int best = 0;

        for (int i = 0; i < s.length(); i++) {
            best = Math.max(best, expand(s, i, i));
            best = Math.max(best, expand(s, i, i + 1));
        }

        return best;
    }

    static int expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String s = br.readLine().trim();

        String doubled = s + s;

        for (int start = 0; start < n; start++) {
            String rotation = doubled.substring(start, start + n);
            System.out.println(longestPalindrome(rotation));
        }
    }
}
