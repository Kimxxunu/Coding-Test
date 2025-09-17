import java.util.*;

class Solution {
    public int solution(String[] board) {
        int row = board.length;
        int col = board[0].length();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(board[i].charAt(j) == 'R'){
                    return BFS(board, row, col, new int[]{i,j});
                }
            }
        }
        return -1;
    }

    public int BFS(String[] board, int row, int col, int[] start){
        int[][] visited = new int[row][col];
        for (int[] v : visited) Arrays.fill(v, -1);

        int[] dy = {-1,1,0,0}; 
        int[] dx = {0,0,-1,1};

        Queue<int[]> q = new ArrayDeque<>();
        q.add(start);
        visited[start[0]][start[1]] = 0;

        while(!q.isEmpty()){
            int[] now = q.poll();
            int y = now[0];
            int x = now[1];

            for(int i=0; i<4; i++){
                int ny = y;
                int nx = x;

                while(true){
                    int ty = ny + dy[i];
                    int tx = nx + dx[i];
                    if(ty<0 || tx<0 || ty>=row || tx>=col) break;
                    if(board[ty].charAt(tx) == 'D') break;
                    ny = ty;
                    nx = tx;
                }

                if(visited[ny][nx] != -1) continue;

                visited[ny][nx] = visited[y][x] + 1;

                if(board[ny].charAt(nx) == 'G') return visited[ny][nx];

                q.add(new int[]{ny,nx});
            }
        }
        return -1;
    }
}
