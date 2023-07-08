class Solution {
    public long putMarbles(int[] w, int k) {
        if(k==1 || k==w.length)
        {
          return 0;
        }
        int[] ps = new int[w.length-1];
        for(int i=0 ; i<w.length-1;i++){
          ps[i] = w[i]+w[i+1];
        }
        Arrays.sort(ps);
        long max = 0;
        long min = 0;
        for(int i=0;i<k-1;i++){
          min += ps[i];
          max += ps[w.length-i-2];
        }
        return (max-min);
    }
}