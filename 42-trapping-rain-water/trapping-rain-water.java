class Solution {
    public int trap(int[] height) {
      int n = height.length;
      int water=0;
      int[] right = new int [n];
      right[0]=height[0];
      for(int i=1;i<n;i++){
        right[i] = Math.max(right[i-1] , height[i]);  
      }
      int[] left = new int [n];
      left[n-1] = height[n-1];
      for(int i=n-2;i>=0;i--){
        left[i] = Math.max(left[i+1],height[i]);
      }
      for(int i=1;i<n;i++){
        water +=Math.min(left[i],right[i])-height[i];
      }
      return water;
    }
}