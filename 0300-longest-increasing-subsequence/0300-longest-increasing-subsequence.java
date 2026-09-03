class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n==0 || nums == null){
            return 0;
        }
        int dp[] =new int[n];
        for(int i =0; i<n; i++){
            dp[i] = 1;
        }

        int maxIS = 1;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i] < nums[j]){
                    dp[j] = Math.max(dp[i] + 1, dp[j]);
                }
            }
            maxIS = Math.max(maxIS, dp[i]);
        }
        return maxIS;
    }
}