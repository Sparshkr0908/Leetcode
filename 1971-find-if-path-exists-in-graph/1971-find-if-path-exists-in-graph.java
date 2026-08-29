class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }
        ArrayList<Integer> graph[] = new ArrayList[n];
        for(int i = 0; i<n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];

            graph[u].add(v);
            graph[v].add(u);
        }
        boolean vis[] = new boolean[n];

        return dfs(graph, source, destination, vis);
    }

    private boolean dfs(ArrayList<Integer> graph[], int current, int destination, boolean vis[]){
        if(current == destination){
            return true;
        }
        vis[current] = true;
        for(int i = 0; i<graph[current].size(); i++){
            int neighbour = graph[current].get(i);
            if(!vis[neighbour] && dfs(graph, neighbour, destination, vis)){
                return true;
            }
        }
        return false;
    }
}