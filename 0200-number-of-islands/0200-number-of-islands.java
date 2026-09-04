class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int maxIsland = 0;

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == '1'){
                    maxIsland++;
                    helper(grid, i, j);
                }
            }
        }
        return maxIsland;
    }

    private void helper(char grid[][], int row, int col){
        int m = grid.length;
        int n = grid[0].length;

        if(row<0 || col <0 || row>=m || col>=n || grid[row][col] == '0'){
            return;
        }

        grid[row][col] = '0';

        helper(grid, row+1, col);
        helper(grid, row-1, col);
        helper(grid, row, col-1);
        helper(grid, row, col+1);
    }
}