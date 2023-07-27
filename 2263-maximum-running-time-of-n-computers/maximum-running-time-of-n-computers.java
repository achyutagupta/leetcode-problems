class Solution {
    public long maxRunTime(int n, int[] bat) {
        Arrays.sort(bat);
        int nob = bat.length;
        long extra=0;
        for(int i=0;i<nob-n;i++){
          extra+=bat[i];
        }
        int[] live = Arrays.copyOfRange(bat , nob-n , nob);
        for(int i=0;i<n-1;i++){
          if(extra<(long)(i+1)*(live[i+1]-live[i])){
            return live[i]+extra/(i+1);
          }
          else{
            extra = extra - (long)(i+1)*(live[i+1]-live[i]);
          }
        }
        return live[n-1]+extra/n;
    }
}