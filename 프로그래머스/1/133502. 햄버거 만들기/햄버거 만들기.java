import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int count = 0; // 햄버거 개수
        Stack<Integer> stack = new Stack<>();
        
        for (int ing : ingredient) {
            stack.push(ing);
            
            // 스택 크기가 4 이상일 때만 검사
            if (stack.size() >= 4) {
                int size = stack.size();
                // 마지막 4개가 1,2,3,1 인지 확인
                if (stack.get(size-4) == 1 &&
                    stack.get(size-3) == 2 &&
                    stack.get(size-2) == 3 &&
                    stack.get(size-1) == 1) {
                    
                    // 햄버거 완성 → 4개 제거
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    
                    count++;
                }
            }
        }
        return count;
    }
}
