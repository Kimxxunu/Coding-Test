import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        if(x==y) return 0;
        int[] dist = new int[y+1];
        Arrays.fill(dist, -1);
        ArrayDeque<Integer> q = new ArrayDeque<>();
        dist[x] = 0;
        q.add(x);
        
        while(!q.isEmpty()){
            int cur = q.poll();
            int d = dist[cur];
            int direct[] = {cur*2,cur*3,cur+n};

            for(int i=0; i<3; i++){
                if(direct[i] > y) continue;
                if(dist[direct[i]] > -1) continue;
                dist[direct[i]] = d+1;
                if(direct[i] == y) return d+1;
                q.add(direct[i]);
                
            }      
        }
        return -1;
    }
}