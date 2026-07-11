class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
        
        for (int[] edge : edges) {
            union(parent, edge[0], edge[1]);
        }
        
        int[] nodesCount = new int[n];
        int[] edgesCount = new int[n];
        
        for (int i = 0; i < n; i++) {
            int r = find(parent, i);
            nodesCount[r]++;
        }
        
        for (int[] edge : edges) {
            int r = find(parent, edge[0]);
            edgesCount[r]++;
        }
        
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (find(parent, i) == i) { // i is a root
                long k = nodesCount[i];
                long requiredEdges = k * (k - 1) / 2;
                if (edgesCount[i] == requiredEdges) {
                    result++;
                }
            }
        }
        
        return result;
    }
    
    private int find(int[] parent, int x) {
        while (parent[x] != x) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }
    
    private void union(int[] parent, int x, int y) {
        int rx = find(parent, x);
        int ry = find(parent, y);
        if (rx != ry) {
            parent[rx] = ry;
        }
    }
}