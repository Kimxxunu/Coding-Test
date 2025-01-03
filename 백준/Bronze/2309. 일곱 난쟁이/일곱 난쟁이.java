import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] heights = new int[9];
        int total = 0;

        for (int i = 0; i < 9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
            total += heights[i];
        }

        int fake1 = 0, fake2 = 0;
        boolean found = false;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (total - heights[i] - heights[j] == 100) {
                    fake1 = i;
                    fake2 = j;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        int[] result = new int[7];
        int idx = 0;
        for (int i = 0; i < 9; i++) {
            if (i != fake1 && i != fake2) {
                result[idx++] = heights[i];
            }
        }

        Arrays.sort(result);
        for (int height : result) {
            System.out.println(height);
        }
    }
}
