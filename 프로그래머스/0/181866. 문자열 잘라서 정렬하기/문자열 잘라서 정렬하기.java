import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
         // 빈 문자열 제거
        List<String> list = new ArrayList<>();
        for (String s : answer) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }

        // 리스트를 배열로 변환 후 정렬
        answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}