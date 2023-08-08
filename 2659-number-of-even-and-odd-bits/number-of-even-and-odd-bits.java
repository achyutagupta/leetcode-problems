class Solution {
    public int[] evenOddBit(int n) {
        int[] ans = new int[2];
        for(int i=0;i<32;i++){
          if((n&(1<<i))>0){
            ans[i%2]++;
          }
        }
        return ans;
    }
}