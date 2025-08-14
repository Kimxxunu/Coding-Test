import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> countByType = new HashMap<>();
        for (String[] c : clothes) {
            String type = c[1];
            countByType.put(type, countByType.getOrDefault(type, 0) + 1);
        }
        
        System.out.println(countByType);

        int answer = 1;
        for (int cnt : countByType.values()) {
            answer *= (cnt + 1); // 그 종류를 안 입는 선택 포함
        }
        return answer - 1; // 전부 안 입는 경우 제외
    }
}
