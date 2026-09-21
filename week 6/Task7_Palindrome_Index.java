import java.io.*;

public class Solution {
    static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

    static int palindromeIndex(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right && s.charAt(left) == s.charAt(right)) {
            left++;
            right--;
        }

        if (left >= right) return -1;

        if (isPalindrome(s, left + 1, right)) return left;
        if (isPalindrome(s, left, right - 1)) return right;

        return -1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine().trim());

        while (q-- > 0) {
            System.out.println(palindromeIndex(br.readLine().trim()));
        }
    }
}
