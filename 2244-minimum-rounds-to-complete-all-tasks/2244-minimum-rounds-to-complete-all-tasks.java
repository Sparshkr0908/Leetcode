class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int task: tasks){
            map.put(task, map.getOrDefault(task, 0) + 1);
        }

        int totalRound = 0;

        for(int count : map.values()){
            if(count == 1){
                return -1;
            }
            totalRound = totalRound + (count+2)/3;
        }
        return totalRound;
    }
}