import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int result = 0;
        
        while(n > 0){
            if(n % 5 == 0){
                result += n / 5;
                break;
            } else {
                n -= 3;
                result++;
            }
            if(n < 0){
                result = -1;
            }
        }
        System.out.print(result);
    }
}