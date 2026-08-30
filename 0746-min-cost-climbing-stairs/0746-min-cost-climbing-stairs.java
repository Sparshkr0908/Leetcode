class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int minCO[] = new int[n+1];
        Arrays.fill(minCO, -1);
        return Math.min(minCost(0,cost, minCO), minCost(1, cost, minCO));
        
    }
    private int minCost(int i, int cost[], int minCO[]){
        if(i>=cost.length){
            return 0;
        }

        if(minCO[i] != -1){
            return minCO[i];
        }

        int Take1Step = minCost(i+1, cost, minCO);
        int Take2Step = minCost(i+2, cost, minCO);

        minCO[i] = cost[i] + Math.min(Take1Step, Take2Step);
        return minCO[i];
    }
}