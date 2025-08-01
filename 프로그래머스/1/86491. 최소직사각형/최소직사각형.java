import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
        // 좌우 큰수 정렬        
        for(int i=0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
        }
        
        int w=0;
        int h=0;
        
        // 최대값 적용
        for(int i=0; i<sizes.length; i++){
            if(w< sizes[i][0]) w = sizes[i][0];
            if(h< sizes[i][1]) h = sizes[i][1];
        }
        
        int answer = w*h;
        return answer;
    }
}