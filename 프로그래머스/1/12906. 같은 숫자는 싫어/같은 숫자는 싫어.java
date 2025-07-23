import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        
        Deque<Integer> st = new ArrayDeque<>();   
        
        for(int a : arr){
            if (!st.isEmpty() && st.peek() == a) continue;
            st.push(a);
        }
        
        int[] answer = new int[st.size()];
        int i=0;
        while(!st.isEmpty()){
            answer[i] = st.pollLast();
            i++;
        }
        
        return answer;
    }
}