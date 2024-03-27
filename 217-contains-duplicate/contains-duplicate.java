class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashMap<Integer,Integer> visited = new HashMap<>();
        // for(int num : nums){
        //     if(visited.containsKey(num) && visited.get(num)>=1)
        //        return true;
        //     visited.put(num,visited.getOrDefault(num,0)+1);
        // }
        // return false;
        final int length = nums.length;
        if (length == 1)
            return false;
        if (length == 2)
            return nums[0] == nums[1];

        for (int i = 1; i < length; i++) {
            final int current = nums[i];
            int j = i - 1, jval = nums[j];
            if (current < jval) {
                while (true) {
                    nums[j + 1] = jval;
                    if (j-- == 0)
                        break;
                    jval = nums[j];
                    if (current >= jval)
                        break;
                }
                nums[j + 1] = current;
            }

            if (j > -1 && current == jval)
                return true;
        }

        return false;
    }
}