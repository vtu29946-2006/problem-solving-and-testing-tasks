import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        String pattern = "SOS";
        int changes = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != pattern.charAt(i % 3)) {
                changes++;
            }
        }

        System.out.println(changes);
    }
}
