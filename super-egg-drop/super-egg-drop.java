class Solution {
    public int superEggDrop(int K, int N) {
        // int dp[][]= new int[n+1][k+1];
        // for(int i=1; i<=n;i++){
        //     for(int j=1; j<=k;j++){
        //         if(j==1)dp[i][j]=1;
        //         if(i==1)dp[i][j]=j;
        //         else{
        //             int min = Integer.MAX_VALUE;
        //             for(int mj=j-1, pj=0; mj>=0; mj--,pj++){
        //                 int v1= dp[i][mj];
        //                 int v2 = dp[i-1][pj];
        //                 int value = Math.max(v1,v2);
        //                 min = Math.min(min,value);
        //                 dp[i][j]= min+1;
        //             }
        //         }
        //     }
        // }
        // return dp[n][k];
          if (N <= 0) {
            return 1;
        }
        if (K <= 1) {
            return N;
        }
        List<List<Integer>> nodes = new ArrayList<>();
        // Initialize DP table for K = 1
        for (int k = 0; k < K - 1; k++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            nodes.add(list);
        }
        int level = 0; // Current level
        int sum = 1; // Total number of nodes in the K-Tree up to current level
        while (sum < N) {
            nodes.get(0).add(nodes.get(0).get(level) + 1);
            for (int k = 1; k < K - 1; k++) {
                nodes.get(k).add(nodes.get(k - 1).get(level) + nodes.get(k).get(level));
            }
            level++;
            sum += nodes.get(K - 2).get(level);
        }
        return level + 1;
    }
}