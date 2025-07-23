import java.util.*;

public class Solution {
    public Stack<Integer> solution(int []arr) {

        
        Stack<Integer> st = new Stack<>();   
        
        for(int a : arr){
            if (!st.isEmpty() && st.peek() == a) continue;
            st.push(a);
        }
        
       
        return st;
    }
}