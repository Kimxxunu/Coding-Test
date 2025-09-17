import java.util.*;

class Solution {
    
    public int solution(String s) {
        int answer = 0;
        
        for(int i=0; i<s.length(); i++){
            if(check(s)) answer++;
            s = goLeft(s);
        }
        return answer;
    }
    public String goLeft(String s){
        return s.substring(1) + s.charAt(0);
    }
    
    
    public boolean check(String s){
        
        if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') return false;        
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            } else {
                if(st.isEmpty()) return false;
                
                if(map.get(st.peek()) != c) return false;
                
                st.pop();
            }
        }
        
        return st.isEmpty();
    }
}

