import java.util.*;

class Solution {
    public String[] solution(String[] orders, int[] course) {
        Map<String, Integer> map = new HashMap<>();

        for (String order : orders) {
            char[] chars = order.toCharArray();
            Arrays.sort(chars);
            for (int c : course) {
                combination(chars, new StringBuilder(), 0, c, map);
            }
        }

        List<String> answerList = new ArrayList<>();
        for (int c : course) {
            int maxCount = 0;
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                if (e.getKey().length() == c && e.getValue() >= 2) {
                    maxCount = Math.max(maxCount, e.getValue());
                }
            }

            
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                if (e.getKey().length() == c && e.getValue() == maxCount && e.getValue() >= 2) {
                    answerList.add(e.getKey());
                }
            }
        }

       
        Collections.sort(answerList);
        return answerList.toArray(new String[0]);
    }

    
    private void combination(char[] arr, StringBuilder sb, int idx, int target, Map<String, Integer> map) {
        if (sb.length() == target) {
            String key = sb.toString();
            map.put(key, map.getOrDefault(key, 0) + 1);
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            sb.append(arr[i]);
            combination(arr, sb, i + 1, target, map);
            sb.deleteCharAt(sb.length() - 1); 
        }
    }
}
