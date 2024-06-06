class Solution {
    public boolean isNStraightHand(int[] n, int k) {
        if ((n.length%k)!=0) return false;
        else {
          Map<Integer,Integer> map = new HashMap<>();
          for(int i:n){
            map.put(i,map.getOrDefault(i,0)+1);
          }
          while(!map.isEmpty()){
              int first = Collections.min(map.keySet());
              for(int j=first;j<first+k;j++){
                if(!map.containsKey(j)){
                  return false;
                }
                else{
                  map.put(j,map.get(j)-1);
                  if(map.get(j)==0){
                    map.remove(j);
                  }
                }
              }
          }
        }
        return true;
    }
}