class Solution {
    public int countNicePairs(int[] n ){
        int mod = (int)Math.pow(10,9)+7;
        HashMap<Long , Integer> map = new HashMap<>();
        long count =0;
        for(int i=0;i<n.length;i++){
          long diff = n[i]-rev(n[i]);
          if(map.containsKey(diff)){
            count=(count%mod+map.get(diff)%mod)%mod;
          }
          map.put(diff , map.getOrDefault(diff , 0)+1 );
        }
        return (int)count;
    }
    public long rev(int num){
      long rev=0;
      while(num>0){
        rev = rev*10+num%10;
        num= num/10;
      }
      return rev;
    }
}