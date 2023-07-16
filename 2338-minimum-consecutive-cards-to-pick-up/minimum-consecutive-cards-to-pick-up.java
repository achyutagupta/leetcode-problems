class Solution {
    public int minimumCardPickup(int[] c) {
      int min=Integer.MAX_VALUE;
      HashMap<Integer,Integer> cd = new HashMap<>();
      for(int i=0;i<c.length;i++){
        if(cd.containsKey(c[i])){
          int j= cd.get(c[i]);
          min = Math.min(min , i-j+1);
        }
        cd.put(c[i],i);
      }
      return (min==Integer.MAX_VALUE)?-1:min;  
    }
}