class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if(matrix == null || matrix.length == 0){
            return result;
        }

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length - 1;



        while(startRow <= endRow && startCol<= endCol){
            //right
            for(int i = startCol; i<=endCol; i++){
                result.add(matrix[startRow][i]);
            }
            startRow++;

            //bottom
            for(int i = startRow; i<=endRow; i++){
                result.add(matrix[i][endCol]);
            }
            endCol--;

            //left
            if(endRow >= startRow){
                for(int i = endCol; i>=startCol; i--){
                    result.add(matrix[endRow][i]);
                }
                endRow--;
            }
            

            //up
            if(startCol <= endCol){
                for(int i = endRow; i>=startRow; i--){
                    result.add(matrix[i][startCol]);
                }
                startCol++;
            }
            
        }
        return result;
    }
}

