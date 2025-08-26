class Solution {
    public int solution(int[] numbers, int target) {
        return DFS(numbers, target, 0, 0);
    }
    
    public int DFS(int[] numbers, int target, int depth, int sum){
        
        if(depth == numbers.length){
            if(sum  == target) return 1;
            else return 0;
        }
       
        int plus = DFS(numbers, target, depth+1, sum+numbers[depth]);
        int minus = DFS(numbers, target, depth+1, sum-numbers[depth]);
        return plus+minus;
    }
    
}