class Solution {
    static void helper(int [][] image, int sr, int sc, int color, int orgcol){
        if(sr<0 || sc<0 || sr>=image.length || sc >= image[0].length || image[sr][sc] != orgcol){
            return;
        }
        image[sr][sc] = color;
        helper(image, sr, sc-1, color, orgcol);
        helper(image, sr, sc+1, color, orgcol);
        helper(image, sr+1, sc, color, orgcol);
        helper(image, sr-1, sc, color, orgcol);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgcol = image[sr][sc];
        if (orgcol != color) {
            helper(image, sr, sc, color, orgcol);
        }
        return image;
    }
}