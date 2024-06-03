class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        buildlist(candidates, target, new ArrayList<>(), 0);
        return ans;
    }
    void buildlist(int[] c, int t, List<Integer> currlist , int i){
      if(t==0) ans.add(new ArrayList<>(currlist));
      else if(t<0 || i>=c.length) return;
      else {
        for(int j=i;j<c.length;j++){
          if(j>i && c[j]==c[j-1]) continue;
          currlist.add(c[j]);
          buildlist(c,t-c[j],currlist,j+1);
          currlist.remove(currlist.size()-1);
        }
      }
    }
}