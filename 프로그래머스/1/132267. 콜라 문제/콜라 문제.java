class Solution {
    public int solution(int a, int b, int n) {
        int total = 0;
        while (n >= a) {
            int exchanged = (n / a) * b;
            total += exchanged;
            n = exchanged + (n % a);
        }
        return total;
    }
}
