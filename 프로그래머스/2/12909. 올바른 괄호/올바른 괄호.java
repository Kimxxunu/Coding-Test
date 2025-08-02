import java.util.*;

class Solution {
    boolean solution(String s) {
        
        Stack<Character> st = new Stack<>();
        int allLeft = 0;
        int allRight = 0;
            
        for(int i=0; i<s.length(); i++) if( s.charAt(i) == '(') allLeft++;
        for(int i=0; i<s.length(); i++) if( s.charAt(i) == ')') allRight++;
        
        if(allLeft == s.length() || allRight == s.length()) return false;
        
        
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == '(') {
                st.push('(');
            } else {
                if (st.isEmpty()) return false; 
                st.pop();
            }
        }
        
        // 디버깅  
        System.out.println(st.isEmpty());
        
        boolean answer = st.isEmpty();

        return answer;
    }
}