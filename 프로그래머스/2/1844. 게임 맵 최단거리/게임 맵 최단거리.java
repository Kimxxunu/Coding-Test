import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = BFS(maps);
        return answer;
    }
    
    public int BFS(int[][] maps){
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        int dist[][] = new int[maps.length][maps[0].length];
        dist[0][0] = 1;
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        
        while(!q.isEmpty()){
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];
            visited[x][y] = true;
            if(x == maps.length-1 && y == maps[0].length-1) return dist[x][y];
        
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx<0 || nx>=maps.length || ny<0 || ny>=maps[0].length || visited[nx][ny] || maps[nx][ny] == 0) continue;
                
                visited[nx][ny] = true;
                dist[nx][ny] = dist[x][y] +1;
                q.offer(new int[]{nx,ny});
            }
            
        }
        
        return -1;
    }
}