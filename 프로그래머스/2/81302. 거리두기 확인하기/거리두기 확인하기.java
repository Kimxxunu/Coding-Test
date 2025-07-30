import java.util.*;

class Solution {
    public int[] solution(String[][] places) {

        int[] answer = new int[5];
        
        // char배열 만들어서 5번 반복
        for(int i=0; i<5; i++){
            char[][] room = new char[5][5];
            for(int j=0; j<5; j++){
                room[j] = places[i][j].toCharArray();
                System.out.println(room[j]);
            }
            // 구분선
            System.out.println("------");
            answer[i] = isOkay(room);
        }
        
        return answer;
    }

    public int isOkay(char[][] room){
        //char[][] visited = new char[5][5];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(room[i][j] == 'P'){
                    if(!BFS(room, i, j)){
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
    
     public boolean BFS(char[][] room, int x, int y){
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
         
        boolean[][] visited = new boolean[5][5];
        visited[x][y] = true;
        
        while (!q.isEmpty()) {
            int[] pos = q.poll();
            int px = pos[0];
            int py = pos[1];

            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];
                int dist = Math.abs(nx - x) + Math.abs(ny - y);

                if (nx >= 0 && ny >= 0 && nx < 5 && ny < 5 && dist <= 2 && !visited[nx][ny]) {
                    visited[nx][ny] = true;

                    if (room[nx][ny] == 'P') return false; // 거리두기 위반
                    if (room[nx][ny] == 'O') q.offer(new int[]{nx, ny});
                }
            }
        }
        return true;
    }

}