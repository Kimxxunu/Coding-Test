class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i + p.length() <= t.length(); i++) {
            System.out.println((t.substring(i, i + p.length()).compareTo(p)));
            if (t.substring(i, i + p.length()).compareTo(p) <= 0) {
                answer++;
            }
        }
        return answer;
    }
}
