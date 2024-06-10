class Solution {
    public int heightChecker(int[] heights) {
        int[] check = heights.clone();
        Arrays.sort(check);
        int count = 0;
        for (int i=0;i<heights.length;i++){
          if(heights[i]!=check[i]){
            count++;
          }
        }
        return count;
    }
}