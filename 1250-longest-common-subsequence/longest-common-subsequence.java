class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int n = t1.length();
        int m = t2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
          for(int j=0;j<=m;j++){
            dp[i][j]=-1;
          }
        }
        return solve(n,m,n,m,t1,t2,dp);
    }
    public int solve(int i , int j ,int n,int m , String t1 , String t2 , int[][] dp){
      if(i==0||j==0) return 0;
      if(dp[i][j]!=-1) return dp[i][j];
      if(t1.charAt(i-1)==t2.charAt(j-1)){
        dp[i][j] = 1 + solve(i-1,j-1,n,m,t1,t2,dp);
        return dp[i][j];
      }
      else{
        dp[i][j] = Math.max(solve(i-1,j,n,m,t1,t2,dp) , solve(i,j-1,n,m,t1,t2,dp));
        return dp[i][j];
      }
    }
}