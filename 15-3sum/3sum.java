class Solution {
    public List<List<Integer>> threeSum(int[] n) {

      
      
      // Hashmap method
      Arrays.sort(n);
      List<List<Integer>> ans = new ArrayList<>();
      HashMap<Integer, Integer> map = new HashMap<>();
      if (n.length < 3) {
        return ans;
      }  
      if (n[0] > 0) {
        return ans;
      }
      for(int i=0;i<n.length;i++){
        map.put(n[i] , i);
      }
      for(int i=0;i<n.length-2;i++){
        if (n[i] > 0) break;
        for(int j=i+1;j<n.length-1;j++){
          int req = -(n[i]+n[j]);
          if(map.containsKey(req) && map.get(req)>j){
            ans.add(Arrays.asList(n[i], n[j], req));
          }
          j = map.get(n[j]);
        }
        i = map.get(n[i]);
      }
      return ans;
    }
}