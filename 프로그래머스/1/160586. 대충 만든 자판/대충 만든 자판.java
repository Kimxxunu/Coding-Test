import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 1. 문자별 최소 눌림 횟수를 저장할 Map
        Map<Character, Integer> minPress = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                int pressCount = i + 1; // 인덱스 0이면 1번 누른 것
                minPress.put(c, Math.min(minPress.getOrDefault(c, Integer.MAX_VALUE), pressCount));
            }
        }

        // 2. 각 target 문자열별로 계산
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int sum = 0;
            boolean possible = true;

            for (int j = 0; j < target.length(); j++) {
                char c = target.charAt(j);
                if (!minPress.containsKey(c)) {
                    possible = false;
                    break;
                }
                sum += minPress.get(c);
            }

            answer[i] = possible ? sum : -1;
        }

        return answer;
    }
}
