import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        int[] arr = new int[n * 2];

        for (int i = 0; i < n * 2; i++) {
            arr[i] = elements[i % n];
        }

        int[] prefix = new int[n * 2 + 1];
        for (int i = 1; i <= n * 2; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }

        Set<Integer> sums = new HashSet<>();

        for (int len = 1; len <= n; len++) {
            for (int start = 0; start < n; start++) {
                int end = start + len;
                int sum = prefix[end] - prefix[start];
                sums.add(sum);
            }
        }

        return sums.size();
    }
}
