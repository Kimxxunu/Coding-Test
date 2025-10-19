class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder answer = new StringBuilder();

        boolean isFirst = true;

        for (char c : s.toCharArray()) {
            if (isFirst && Character.isLetter(c)) {
                answer.append(Character.toUpperCase(c));
            } else {
                answer.append(c);
            }
            isFirst = (c == ' ');
        }

        return answer.toString();
    }
}
