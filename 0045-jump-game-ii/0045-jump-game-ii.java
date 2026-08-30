class Solution {
    public int jump(int[] nums) {
        int n = nums.length;

        int currentEnd = 0;
        int maxReach = 0;
        int count = 0;
        for(int i =0; i<n-1; i++){
            maxReach = Math.max(maxReach, i+nums[i]);
            
            if(i == currentEnd){
                count++;
                currentEnd = maxReach;
            }
            if(currentEnd>= n-1){
                break;
            }
        }
        return count;
    }
}