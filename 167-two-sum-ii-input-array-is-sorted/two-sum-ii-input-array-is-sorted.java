class Solution {
    public int[] twoSum(int[] n, int t) {
        int l=0, r=n.length-1;
        while(l<r){
          if(n[l]+n[r]==t){
            return new int[] {l+1 , r+1};
          }else if(n[l]+n[r]>t){
            r--;
          }else {
            l++;
          }
        }
        return new int[] {-1,-1};
    }
}