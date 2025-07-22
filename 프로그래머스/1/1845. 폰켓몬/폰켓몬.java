import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int size = nums.length/2;
        System.out.println(size);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) {
            if(map.get(num)!=null) continue;
            map.put(num,1);
        }
        
        if(map.size()< size) answer = map.size();
        else answer = size;
        
        return answer;
    }
}