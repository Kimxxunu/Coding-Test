class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = cnt(n);
        int ncnt = 0;
        while(count != ncnt){
            n++;
            ncnt = cnt(n);
            answer = n;
        }
        return answer;
    }
    
    public int cnt(int n){
        int count = 0;
        while(n>2){
            if(n%2==1) count++;
            n/=2;
        }
        return count;
    }
}