class Solution {
    public int climbStairs(int n) {
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        return countWays(n, ways);
    }
    private int countWays(int n, int ways[]){
        if(n == 0 || n==1){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n] != -1){
            return ways[n];
        }

        ways[n] = countWays(n-1, ways) + countWays(n-2, ways);
        return ways[n];
    }
}