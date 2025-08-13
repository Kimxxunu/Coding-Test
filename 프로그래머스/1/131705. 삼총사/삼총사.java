class Solution {
    public int solution(int[] number) {
        return dfs(number, 0, 0, 0);
    }

    private int dfs(int[] number, int idx, int picked, int sum) {
        if (picked == 3) return sum == 0 ? 1 : 0;
        if (idx == number.length) return 0;

        // 현재 원소 선택
        int take = dfs(number, idx + 1, picked + 1, sum + number[idx]);
        // 현재 원소 건너뛰기
        int skip = dfs(number, idx + 1, picked, sum);

        return take + skip;
    }
}
