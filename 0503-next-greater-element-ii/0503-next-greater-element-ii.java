class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        int nextGreatest[] = new int[n];
        for (int i = 2 * n - 1; i >= 0; i--) {
            int currentIdx = i % n; 
            while (!s.isEmpty() && s.peek() <= nums[currentIdx]) {
                s.pop();
            }

            if (i < n) {
                if (s.isEmpty()) {
                    nextGreatest[currentIdx] = -1;
                } else {
                    nextGreatest[currentIdx] = s.peek(); 
                }
            }
            s.push(nums[currentIdx]);
        }
        return nextGreatest;
    }
}