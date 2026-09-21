import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String a = br.readLine().trim();
            String b = br.readLine().trim();

            boolean[] present = new boolean[256];
            for (char c : a.toCharArray()) present[c] = true;

            boolean found = false;
            for (char c : b.toCharArray()) {
                if (present[c]) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "YES" : "NO");
        }
    }
}
