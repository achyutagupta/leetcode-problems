class Solution {
    public int[] twoSum(int[] nums, int target) {
      // Using Double Loop
      // int[] pair = new int[2];
      //   for(int i=0;i<nums.length;i++){
      //     for(int j=0;j<nums.length;j++){
      //       if(nums[i]+nums[j]==target&&(i!=j)){
      //         pair[0]=i;
      //         pair[1]=j;
      //         break;
      //       }
      //     }
      //   }
      // return pair;
      // Using HashSet
      HashMap<Integer , Integer> map = new HashMap<>();
      int[] ans = new int[2];
      for (int i=0;i<nums.length;i++) {
        if (map.containsKey(target - nums[i])){
           ans[0] = map.get(target - nums[i]);
           ans[1] = i;
           break;
        }
        else{
          map.put(nums[i] , i);
        }
      }
      return ans;
    }
}