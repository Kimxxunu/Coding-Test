import java.util.*;

class Solution{
    public int solution(String s){

        Deque<Character> st = new ArrayDeque<>();
        
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == c){
                st.pop();
                continue;
            }
            st.push(c);
        }

        return st.isEmpty() ? 1 : 0;
    }
}

