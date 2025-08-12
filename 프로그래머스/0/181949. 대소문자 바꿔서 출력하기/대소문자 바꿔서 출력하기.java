import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();                     
        StringBuilder sb = new StringBuilder(str.length());

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sb.append(Character.isLowerCase(c)
                    ? Character.toUpperCase(c)
                    : Character.toLowerCase(c));
        }

        System.out.print(sb.toString());               
    }
}
