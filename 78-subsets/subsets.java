class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        calsubset(0 , nums , new ArrayList<>());
        return ans;
    }
    void calsubset(int ind, int[] nums, List<Integer> subset ){
      if (ind >= nums.length){
        ans.add(new ArrayList<>(subset));
        return;
      }
      subset.add(nums[ind]);
      calsubset(ind+1 , nums , subset);
      subset.remove(subset.size()-1);
      calsubset(ind+1 , nums , subset);
      return;
    }
}
