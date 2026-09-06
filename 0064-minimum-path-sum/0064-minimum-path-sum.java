class Solution {
    public int minPathSum(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        if(grid == null || row == 0 || col == 0){
            return 0;
        }

        for(int c=1; c<col; c++){
            grid[0][c] += grid[0][c-1];
        }

        for(int r = 1; r<row; r++){
            grid[r][0] += grid[r-1][0];
        }


        for(int i = 1; i<row; i++){
            for(int j = 1; j<col; j++){
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[row-1][col-1];
    }
}