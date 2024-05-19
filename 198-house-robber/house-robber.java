class Solution {
    public int rob(int[] n) {
      int[] dp = new int[n.length];
      dp[0] = n[0];
      for(int i=1;i<n.length;i++){
        int take = n[i];
        if(i>1) take += dp[i-2];
        int ntake = dp[i-1];
        dp[i] = Math.max(take , ntake);
      }
      return dp[n.length-1];
    }
    // int robbery(int[] n){
    //   int[] dp = new dp[nums.length];
    //   dp[0] = n[0];
    //   for(int i=0;i<n.length;i++){
    //     int take = n[i];
    //     if(i>1) take += dp[i-2];
    //     int ntake = dp[i-1];
    //     dp[i] = Math.max(take , ntake);
    //   }
    //   return dp[n.length-1];
    // }
}