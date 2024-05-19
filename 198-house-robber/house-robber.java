class Solution {
    public int rob(int[] n) {
      // int[] dp = new int[n.length];
      // dp[0] = n[0];
      // for(int i=1;i<n.length;i++){
      //   int take = n[i];
      //   if(i>1) take += dp[i-2];
      //   int ntake = dp[i-1];
      //   dp[i] = Math.max(take , ntake);
      // }
      // return dp[n.length-1];


      // Space Optimization
      int prev1 = n[0];
      int prev2 = 0;
      int curri = 0;
      for(int i=1;i<n.length;i++){
        int take = n[i];
        if (i>1) take += prev2;
        int ntake = prev1;
        curri = Math.max(take , ntake);
        prev2 = prev1;
        prev1 = curri;
      }
      return prev1;
    }
}