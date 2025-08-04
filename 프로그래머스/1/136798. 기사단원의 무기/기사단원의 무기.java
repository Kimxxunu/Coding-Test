class Solution {
    public int solution(int number, int limit, int power) {
        
        int answer = 0;
        
        for(int i=1; i<=number; i++){
            // 약수의 개수를 구함
            int count = 0;
            for(int j = 1; j * j <= i; j++) {
                if(i % j == 0) {
                    count += (j * j == i) ? 1 : 2;
                }
            }
            // 제한수치 보다 크면 power로 적용
            if(count>limit) count = power;
            System.out.println(count);
            answer += count;
        }
        
        return answer;
    }
}