class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort indices based on the values of nums
        Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));

        int[] res = new int[n];
        List<Integer> groupVal = new ArrayList<>();
        List<Integer> groupIdx = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[indices[i]] - nums[indices[i - 1]] > limit) {
                // Process the previous group
                Collections.sort(groupIdx);
                for (int j = 0; j < groupIdx.size(); j++) {
                    res[groupIdx.get(j)] = groupVal.get(j);
                }
                groupVal.clear();
                groupIdx.clear();
            }
            groupVal.add(nums[indices[i]]);
            groupIdx.add(indices[i]);
        }

        // Process the last group
        Collections.sort(groupIdx);
        for (int j = 0; j < groupIdx.size(); j++) {
            res[groupIdx.get(j)] = groupVal.get(j);
        }

        return res;
    }
}