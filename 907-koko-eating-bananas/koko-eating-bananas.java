// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {
//         int high = piles[0];
//         for (int i=1;i<piles.length;i++){
//           high = Math.max(high, piles[i]);
//         }
//         int low = 1;
//         int ans = high; 
//         while (low<=high){
//           int mid = low + (high - low)/2;
//           int total = 0;
//           for (int i=0;i<piles.length;i++){
//             total = total + (int) Math.ceil(((double)piles[i])/((double)mid));
//           }
//           if(total <= h){
//             high = mid - 1;
//             ans = Math.min(ans,mid);
//           }
//           else {
//             low = mid +1;
//           }
//         }
//         return ans;
//     }
// }
class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        // Initalize the left and right boundaries
        int left = 1, right = 1;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            // Get the middle index between left and right boundary indexes.
            // hourSpent stands for the total hour Koko spends.
            int middle = (left + right) / 2;
            int hourSpent = 0;

            // Iterate over the piles and calculate hourSpent.
            // We increase the hourSpent by ceil(pile / middle)
            for (int pile : piles) {
                hourSpent += Math.ceil((double) pile / middle);
            }

            // Check if middle is a workable speed, and cut the search space by half.
            if (hourSpent <= h) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        // Once the left and right boundaries coincide, we find the target value,
        // that is, the minimum workable eating speed.
        return right;
    }
}
