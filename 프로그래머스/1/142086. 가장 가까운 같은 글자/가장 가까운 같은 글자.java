import java.util.*;

class Solution {
    public int[] solution(String s) {
        int n = s.length();
        int[] answer = new int[n];
        Map<Character, Integer> lastSeen = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            
            if (lastSeen.containsKey(ch)) {
                answer[i] = i - lastSeen.get(ch);
            } else {
                answer[i] = -1;
            }
            
            lastSeen.put(ch, i); // 현재 위치 갱신
        }
        
        return answer;
    }
}
