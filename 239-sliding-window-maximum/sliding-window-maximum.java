// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int[] ans = new int[nums.length-k+1];
//         int last = k-1;
//         for(int i=0;i<=nums.length-k;i++){
//           int max=nums[i];
//           for(int j=i;j<=last;j++){
//             max = Math.max(max , nums[j]);
//           }
//           last++;
//           ans[i]=max;
//         }
//         return ans;
//     }
// }
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        // Process the first window separately
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        result[0] = nums[deque.peekFirst()];

        // Process remaining windows
        for (int i = k; i < n; i++) {
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            result[i - k + 1] = nums[deque.peekFirst()];
        }

        return result;
    }
}
