class Solution {
    public List<List<Integer>> threeSum(int[] n) {
    // 2 pointer method
      List<List<Integer>> ans = new ArrayList<>();
      Arrays.sort(n);
      for(int i=0;i<n.length-2;i++){
        if(n[i]>0) break;
        if(i>0 && n[i]==n[i-1]) continue;
        int j=i+1;
        int k=n.length-1;
        while(j<k){
          if(n[i]+n[j]+n[k]<0){
            j++;
          }else if (n[i]+n[j]+n[k]>0){
            k--;
          }else{
            ans.add(Arrays.asList(n[i] , n[j], n[k]));
            j++;
            k--;
            while(j<k && n[j]==n[j-1]) j++;
            while(j<k && n[k]==n[k+1]) k--;
          }
        }
      }
      return ans;
    }
}
    //   Hashmap method
    //   Arrays.sort(n);
    //   List<List<Integer>> ans = new ArrayList<>();
    //   HashMap<Integer, Integer> map = new HashMap<>();
    //   if (n.length < 3) {
    //     return ans;
    //   }  
    //   if (n[0] > 0) {
    //     return ans;
    //   }
    //   for(int i=0;i<n.length;i++){
    //     map.put(n[i] , i);
    //   }
    //   for(int i=0;i<n.length-2;i++){
    //     if (n[i] > 0) break;
    //     for(int j=i+1;j<n.length-1;j++){
    //       int req = -(n[i]+n[j]);
    //       if(map.containsKey(req) && map.get(req)>j){
    //         ans.add(Arrays.asList(n[i], n[j], req));
    //       }
    //       j = map.get(n[j]);
    //     }
    //     i = map.get(n[i]);
    //   }
    //   return ans;
    // }
    // }