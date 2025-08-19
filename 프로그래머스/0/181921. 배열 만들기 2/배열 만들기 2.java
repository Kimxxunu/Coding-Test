import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        // 2^6 = 64 가지 조합 (최대 6자리)
        for (int i = 1; i < (1 << 6); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 5; j >= 0; j--) {
                if ((i & (1 << j)) != 0) sb.append("5");
                else sb.append("0");
            }
            int num = Integer.parseInt(sb.toString());
            if (num >= l && num <= r) list.add(num);
        }
        
        if (list.isEmpty()) return new int[]{-1};
        
        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
