class Solution {
    public String solution(String s, String skip, int index) {
        boolean[] banned = new boolean[26];
        for (char c : skip.toCharArray()) banned[c - 'a'] = true;

        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int cur = ch - 'a';
            int moved = 0;
            while (moved < index) {
                cur = (cur + 1) % 26;
                if (banned[cur]) continue; // 건너뛰기
                moved++;
            }
            sb.append((char) ('a' + cur));
        }
        return sb.toString();
    }
}
