class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        buildlist(candidates, target, new ArrayList<>(), 0);
        return ans;
    }
    void buildlist(int[] c, int t, List<Integer> currlist , int i){
      if(t==0) ans.add(new ArrayList<>(currlist));
      else if(t<0 || i>=c.length) return;
      else {
        currlist.add(c[i]);
        buildlist(c,t-c[i],currlist,i);
        currlist.remove(currlist.size()-1);
        buildlist(c,t,currlist,i+1);
      }
    }
}