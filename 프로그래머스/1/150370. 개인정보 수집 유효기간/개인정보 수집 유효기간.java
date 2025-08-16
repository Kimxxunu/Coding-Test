import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();
        
        // 오늘 날짜를 일 단위로 변환
        int todayDate = toDays(today);
        
        // 약관 정보 저장
        for (String term : terms) {
            String[] parts = term.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }
        
        // 개인정보 유효기간 확인
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            String date = parts[0];
            String type = parts[1];
            
            int collectedDate = toDays(date);
            int months = termMap.get(type);
            
            // 만료일 = 수집일자 + (유효기간 * 28일) - 1
            int expireDate = collectedDate + (months * 28) - 1;
            
            if (expireDate < todayDate) {
                result.add(i + 1); // 번호는 1부터 시작
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
    
    // 날짜를 일 단위로 변환
    private int toDays(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
}
