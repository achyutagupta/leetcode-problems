class Solution {
    public int tribonacci(int n) {
        int[] trib = new int[38];
        trib[0]=0;
        trib[1]=1;
        trib[2]=1;
        for(int i=0;i<n-2;i++){
          trib[i+3]=trib[i]+trib[i+1]+trib[i+2];
        }
        return trib[n];
    }
}