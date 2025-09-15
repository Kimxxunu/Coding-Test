import java.util.*;

class Solution {
    Set<Integer> set = new HashSet<>();
    boolean[] visited;

    public int solution(String numbers) {
        visited = new boolean[numbers.length()];
        dfs("", numbers);
        
        int count = 0;
        for (int num : set) {
            if (isPrime(num)) count++;
        }
        return count;
    }

    // DFS로 모든 조합 만들기
    public void dfs(String cur, String numbers) {
        if (!cur.equals("")) {
            set.add(Integer.parseInt(cur)); // 숫자 조합 저장
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(cur + numbers.charAt(i), numbers);
                visited[i] = false;
            }
        }
    }

    // 소수 판별
    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
