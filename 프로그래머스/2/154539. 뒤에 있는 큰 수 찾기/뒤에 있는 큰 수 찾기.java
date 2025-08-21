import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        Arrays.fill(answer, -1);

        ArrayDeque<Integer> st = new ArrayDeque<>(); // 인덱스를 담는 스택 (값이 내림차순이 되도록 유지)

        for(int i=0; i<n; i++){
            while(!st.isEmpty() && numbers[st.peek()] < numbers[i]){
                answer[st.pop()] = numbers[i];
            }
            st.push(i);
        }
       
        return answer;
    }
}
