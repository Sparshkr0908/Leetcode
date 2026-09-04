class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        getCombinator(candidates, target, 0, result, new ArrayList<>());
        return result;
    }

    private void getCombinator(int candidates[], int target, int idx, List<List<Integer>> result, List<Integer> currentList){
        if(target<0) return;

        else if(target == 0){
            result.add(new ArrayList<>(currentList));
        }

        else{
            for(int i = idx; i<candidates.length; i++){
                currentList.add(candidates[i]);
                getCombinator(candidates, target-candidates[i], i, result, currentList);
                currentList.remove(currentList.size() - 1);
            }
        }
    }
}