class Solution {
    public int rob(int[] nums) {
        if(nums==null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }

        int profit1 = robHouse(nums, 0, nums.length-2);
        int profit2 = robHouse(nums, 1, nums.length-1);

        return Math.max(profit1, profit2);

    }
    private int robHouse(int[] nums, int start, int end){
        int numHouse = end - start + 1;

        int dp[] = new int[numHouse];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start+1]);
        for(int i = 2; i<numHouse; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[start + i]);
        }
        return dp[numHouse - 1]; 
    }
}