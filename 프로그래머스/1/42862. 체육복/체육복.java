import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int[] st = new int[n];
        
        for(int i=0; i<n; i++) st[i] = 1;
        
        for(int los : lost) st[los-1]--;
        
        for(int re : reserve) st[re-1]++;
        
        for(int i=0; i<n; i++) {
            if(st[i] > 1) {
                if(i > 0 && st[i-1] == 0) {
                    st[i]--;
                    st[i-1]++;
                } else if(i < n-1 && st[i+1] == 0) {
                    st[i]--;
                    st[i+1]++;
                }
            }
        }
        
        int answer = 0;
        for(int i=0; i<n; i++) {
            if(st[i] > 0) answer++;
        }
        return answer;
        
    }
}