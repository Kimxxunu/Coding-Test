import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] n = new String[3];
        int a, b;

        for(int i = 0; i < 3; i++){
            n[i] = bf.readLine();
        }

        a = Integer.parseInt(n[0]) + Integer.parseInt(n[1]) - Integer.parseInt(n[2]);
        b = Integer.parseInt(n[0] + n[1]) - Integer.parseInt(n[2]);

        sb.append(a).append("\n").append(b);
        System.out.println(sb);
    }
}
