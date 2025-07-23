import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int size = nums.length/2;
        System.out.println(size);
        
        HashSet<Integer> hs = new HashSet<>();
        
        // 중복값 제외
        for(int num : nums) {
            hs.add(num);
        }
        
        if(hs.size()< size) answer = hs.size();
        else answer = size;
        
        return answer;
    }
}