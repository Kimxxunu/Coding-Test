import java.util.*;

class Solution {
    public List<Integer> solution(String[] maps) {
        int row = maps[0].length();
        int col = maps.length;
        boolean[][] visited = new boolean[col][row];
        char[][] map = new char[col][row];
        
        System.out.println("---문자열 변환---");
        
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                map[i][j] = maps[i].charAt(j);
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        List<Integer> li = new ArrayList<>();
        Deque<int[]> q = new ArrayDeque<>();
        
        
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                if(visited[i][j]) continue;
                 if(map[i][j] != 'X' && !visited[i][j]){
                     q.add(new int[]{i,j});
                     visited[i][j] = true;
                     int sum = 0;
                     while(!q.isEmpty()){
                         
                         int[] arr =  q.poll();
                         int x = arr[0];
                         int y = arr[1];
                         
                         System.out.println("방문 : "+map[x][y]);
                         
                         
                         
                         
                         for(int k=0; k<4; k++){
                             int nx = x+dx[k];
                             int ny = y+dy[k];
                             
                             if( nx<0 || ny <0 || nx>=col || ny >=row) continue;
                             if(map[nx][ny] == 'X' || visited[nx][ny]) continue;
                             visited[nx][ny] = true;
                             q.add(new int[]{nx, ny});
                         }
                         sum += map[x][y] - '0';
                         
                     }
                     System.out.println("방문끝 ");
                     li.add(sum);
                     
                 }
            }
        }
        Collections.sort(li);
        if(li.isEmpty()) li.add(-1);
        return li;
    }
    
}