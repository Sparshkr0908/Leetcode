class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        if (a.length > b.length) return findMedianSortedArrays(b, a);
        int x = a.length, y = b.length;
        int lo = 0, hi = x;
        int half = (x + y + 1) >>> 1;

        while (lo <= hi) {
            int cutA = (lo + hi) >>> 1;
            int cutB = half - cutA;

            int leftA = cutA == 00 ? Integer.MIN_VALUE : a[cutA - 1];
            int rightA = cutA == x ? Integer.MAX_VALUE : a[cutA];
            int leftB = cutB == 0 ? Integer.MIN_VALUE : b[cutB - 1];
            int rightB = cutB == y ? Integer.MAX_VALUE : b[cutB];

            if (leftA <= rightB && leftB <= rightA) {
                if (((x + y) & 1) == 1) return Math.max(leftA, leftB);
                return (Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0;
            } 
            else if (leftA > rightB) {
                hi = cutA - 1;
            } 
            else {
                lo = cutA + 1;
                }
        }
        return 0.0;
    }
}