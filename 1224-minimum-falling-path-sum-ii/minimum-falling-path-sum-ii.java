class Solution {
    int[][] dp;
    public int minFallingPathSum(int[][] nums) {
        int rows = nums.length;
        int cols = rows;
        dp = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        
        int result = Integer.MAX_VALUE;

        for (int j = 0; j < cols; j++) {
            result = Math.min(result, recurHelper(nums, rows - 1, j));
        }
        return result;
    }
    
    public int recurHelper(int[][] nums, int rowIndex, int colIndex) {
        if (rowIndex < 0 || colIndex < 0 || colIndex > nums[0].length) {
            return Integer.MAX_VALUE;
        } else if (rowIndex == 0) {
            return nums[rowIndex][colIndex];
        }else {
            if (dp[rowIndex][colIndex] != Integer.MAX_VALUE) {
                return dp[rowIndex][colIndex];
            } else {
                int res = nums[rowIndex][colIndex];
                int val = Integer.MAX_VALUE;
                for (int i = 0; i < nums[0].length; i++) {
                    if (i == colIndex) {
                        continue;
                    }
                    val = Math.min(val, recurHelper(nums, rowIndex - 1, i));
                }
                dp[rowIndex][colIndex] = res + val;
                return res + val;
            }
        }
    }
}