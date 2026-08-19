class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];
            map.put(
                row,
                map.getOrDefault(row, 0) | (1 << (col - 1))
            );
        }
        int ans = 0;
        ans += (n - map.size()) * 2;

        // Masks
        int left   = 0b0000011110;  
        int middle = 0b0001111000; 
        int right  = 0b0111100000;  
        for (int reserved : map.values()) {
            if ((reserved & left) == 0 &&
                (reserved & right) == 0) {

                ans += 2;
            }
            else if ((reserved & left) == 0 ||
                     (reserved & middle) == 0 ||
                     (reserved & right) == 0) {

                ans += 1;
            }
        }

        return ans;
    }
}