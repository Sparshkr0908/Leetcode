class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int MaxSum = Integer.MIN_VALUE;
        int CurrSum = 0;
        for(int i = 0; i<n; i++){
            CurrSum = CurrSum + nums[i];
            MaxSum = Math.max(MaxSum, CurrSum);
            if(CurrSum < 0){
                CurrSum = 0;
            }
        }
        return MaxSum;
    }
}