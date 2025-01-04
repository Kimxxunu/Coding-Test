import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        Stack<Integer> st = new Stack<>();

        while (n-- > 0) {
            String[] s = bf.readLine().split(" ");

            switch (s[0]) {
                case "push":
                    st.push(Integer.parseInt(s[1]));
                    break;

                case "pop":
                    sb.append(st.isEmpty() ? -1 : st.pop()).append("\n");
                    break;

                case "size":
                    sb.append(st.size()).append("\n");
                    break;

                case "empty":
                    sb.append(st.isEmpty() ? 1 : 0).append("\n");
                    break;

                case "top":
                    sb.append(st.isEmpty() ? -1 : st.peek()).append("\n");
                    break;

                default:
                    break;
            }
        }

        System.out.print(sb);
    }
}
