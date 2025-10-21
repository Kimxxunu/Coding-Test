class Solution {
    boolean solution(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            else count--;

            // 닫는 괄호가 더 많아지면 즉시 false
            if (count < 0) return false;
        }

        // 모두 돌고 괄호 수가 딱 맞으면 true
        return count == 0;
    }
}
