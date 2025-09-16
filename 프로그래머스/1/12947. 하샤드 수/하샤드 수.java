class Solution {
    public boolean solution(int x) {
        int n = 0;
        int a = x;
        while(a>0){
            n += a%10;
            a /= 10;
        }
        System.out.println(n);
        return x%n == 0 ? true : false;
    }
}