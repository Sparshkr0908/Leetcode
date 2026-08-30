class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int MinIdx = 0;
        int MaxIdx = 0;

        for(int i = 0; i<n; i++){
            if(nums[i] < nums[MinIdx]){
                MinIdx = i;
            }
        }
        for(int i = 0; i<n; i++){
            if(nums[i] > nums[MaxIdx]){
                MaxIdx = i;
            }
        }

        int i = Math.min(MaxIdx, MinIdx);
        int j = Math.max(MaxIdx, MinIdx);

        int deleteFront = j+1;
        int deleteBack = n-i;
        int mid = (i+1) + (n-j);
        int ans = Math.min(mid, Math.min(deleteFront, deleteBack));

        return ans;
    }
}