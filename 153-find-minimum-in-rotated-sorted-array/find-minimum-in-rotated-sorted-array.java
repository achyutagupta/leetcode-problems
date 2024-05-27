class Solution {
    public int findMin(int[] n) {
        int l = 0;
        int h = n.length-1;
        int ans = Integer.MAX_VALUE;
        while(l<=h){
          int m = l + (h-l)/2;
          ans = Math.min(ans , n[m]);
          if (n[m] <= n[h] ){
            h = m-1;
          }
          else {
            l = m+1;
          }
        }
        return ans;
    }
}