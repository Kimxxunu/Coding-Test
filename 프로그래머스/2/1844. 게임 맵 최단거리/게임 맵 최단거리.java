import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        return BFS(maps);
    }
    
    public int BFS(int[][] maps){
        int n = maps.length;        // 행(세로, y의 범위)
        int m = maps[0].length;     // 열(가로, x의 범위)
        boolean[][] visited = new boolean[n][m];
        int[][] dist = new int[n][m];
        
        Deque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, 0});     // x, y
        visited[0][0] = true;         // 큐에 넣을 때 방문표시
        dist[0][0] = 1;               // 시작 칸 포함

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        while (!q.isEmpty()) {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];

            if (x == m - 1 && y == n - 1) return dist[y][x];  // 도착
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue;      // 범위
                if (maps[ny][nx] == 0 || visited[ny][nx]) continue;        // 벽/방문

                visited[ny][nx] = true;                 // 큐에 넣을 때 방문처리
                dist[ny][nx] = dist[y][x] + 1;          // 거리 갱신
                q.offer(new int[]{nx, ny});
            }
        }
        return -1;
    }
}
