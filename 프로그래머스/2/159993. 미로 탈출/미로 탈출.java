import java.util.*;

class Solution {
    public int solution(String[] maps) {
        int answer = 0;
        
        // 미로 사이즈 정의
        int w = maps.length;
        int h = maps[0].length();
        
        // 'S' 를 발견하면 BFS 시작
        for(int i=0; i<w; i++){
            for(int j=0; j<h; j++){
                if(maps[i].charAt(j) == 'S'){
                    answer = LBFS(maps, i, j);
                    break;
                } 
            }
        }
        
        return answer;
    }
    
    public int LBFS(String[] maps, int x, int y){
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        int px = x;
        int py = y;
        
        int result =0;
        boolean[][] visited = new boolean[maps.length][maps[0].length()];
        visited[px][py] = true;
        
        int[][] dist = new int[maps.length][maps[0].length()];
        dist[px][py] = 0;
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{px,py});
        
        
        while(!q.isEmpty()){
        
            int[] pol = q.poll();
            px = pol[0];
            py = pol[1];
            
            if(maps[px].charAt(py) == 'L') {
                result = EBFS(maps,px,py,dist[px][py]);
                return result;
            }
            
            for(int i=0; i<4; i++){
                int nx = px + dx[i];
                int ny = py + dy[i];
                
                // 이동지역을 벗어나기 방지
                if(nx < 0 || nx>= maps.length || ny<0 || ny >= maps[0].length() ) continue;
                
                // 특정 조건 접근 방지
                if(maps[nx].charAt(ny) == 'X' || visited[nx][ny] == true) continue;
                
                
                q.offer(new int[]{nx,ny});
                dist[nx][ny] = dist[px][py] + 1;
                visited[nx][ny] = true;
                
            }
        }
        
        for(int i=0; i<dist.length; i++){
            for(int j=0; j<dist[0].length; j++){
                    System.out.print(dist[i][j]);        
                }
                System.out.println();        
            }
        
        for(int i=0; i<dist.length; i++){
            for(int j=0; j<dist[0].length; j++){
                    System.out.print(visited[i][j]+ "  ");        
                }
                System.out.println();        
            }
        
        System.out.println(result); 
        return -1;
    }
    
    public int EBFS(String[] maps, int x, int y, int r){
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        int px = x;
        int py = y;
        
        int result = r;
       
        
        boolean[][] visited = new boolean[maps.length][maps[0].length()];
        visited[px][py] = true;
        
        int[][] dist = new int[maps.length][maps[0].length()];
        dist[px][py] = 0;
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{px,py});
        
        
        while(!q.isEmpty()){
            
        
            int[] pol = q.poll();
            px = pol[0];
            py = pol[1];
            
            
            if( maps[px].charAt(py) == 'E'){
                    result += dist[px][py];
                    return result;
            } 
            
            
            for(int i=0; i<4; i++){
                int nx = px + dx[i];
                int ny = py + dy[i];
                
                // 이동지역을 벗어나기 방지
                if(nx < 0 || nx>= maps.length || ny<0 || ny >= maps[0].length() ) continue;
                
                // 특정 조건 접근 방지
                if(maps[nx].charAt(ny) == 'X' || visited[nx][ny] == true) continue;
                
                
                q.offer(new int[]{nx,ny});
                dist[nx][ny] = dist[px][py] + 1;
                visited[nx][ny] = true;
                
            }
        }
     
        for(int i=0; i<dist.length; i++){
            for(int j=0; j<dist[0].length; j++){
                    System.out.print(dist[i][j]);        
                }
                System.out.println();        
            }
        
        for(int i=0; i<dist.length; i++){
            for(int j=0; j<dist[0].length; j++){
                    System.out.print(visited[i][j]+ "  ");        
                }
                System.out.println();        
            }
        
       
        
        System.out.println(result); 
        
        return -1;
    }
    
    
}