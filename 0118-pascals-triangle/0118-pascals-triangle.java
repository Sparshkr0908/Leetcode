class Solution {
    public List<List<Integer>> generate(int numRows) {
        int dp[][] = new int[numRows][numRows];

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j<=i; j++){
                if(j == 0 || j==i){
                    dp[i][j] = 1;
                }

                else{
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }

                row.add(dp[i][j]);
            }
            result.add(row);
        }
        return result;
    }
}