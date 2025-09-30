import java.util.*; 

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int answer = arr[arr.length-1];
        for(int i=0; i<arr.length; i++){
            if(answer%arr[i] != 0){
                i=0;
                answer++;
            }
        }
        
        return answer;
    }
}