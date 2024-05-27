class Solution {
    public int search(int[] n, int t) {
        int l = 0;
        int h = n.length-1;
        while(l<=h){
          int m = l + (h-l)/2;
          if(n[m]==t) return m;
          if (n[l] <= n[m]) {
              if (n[l] <= t && t < n[m]) {
                  h = m - 1;
              } else {
                  l = m + 1;
              }
          }
          else {
              if (n[m] < t && t <= n[h]) {
                  l = m + 1;
              } else {
                  h = m - 1;
              }
          }
        } 
        return -1;
    }
}