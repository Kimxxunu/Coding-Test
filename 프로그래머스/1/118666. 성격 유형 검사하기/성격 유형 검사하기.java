import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        
        char[] arr = {'R','T','C','F','J','M','A','N'};
        // hashmap으로 유형과 0 으로 초기화
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char a : arr) hm.put(a,0);
        
        // 점수 반영전 로그
        System.out.println(hm);
        
        // 성격유형에 점수 부여
        for(int i=0; i< survey.length; i++){
            if(choices[i]-4 < 0){
                char firstChar = survey[i].charAt(0);
                hm.put(firstChar, hm.get(firstChar) + (4-choices[i]));
                
            }else{
                char secondChar = survey[i].charAt(1);
                hm.put(secondChar, hm.get(secondChar) + (choices[i] % 4));
            }
        }
        
        // 점수 반영후 로그
        System.out.println(hm);
        
        // 결과생성
        StringBuilder answer = new StringBuilder();
        if(hm.get('R') >= hm.get('T')) answer.append('R');
        else answer.append('T');

        if(hm.get('C') >= hm.get('F')) answer.append('C');
        else answer.append('F');

        if(hm.get('J') >= hm.get('M')) answer.append('J');
        else answer.append('M');

        if(hm.get('A') >= hm.get('N')) answer.append('A');
        else answer.append('N');

        return answer.toString();
    
    }
}

