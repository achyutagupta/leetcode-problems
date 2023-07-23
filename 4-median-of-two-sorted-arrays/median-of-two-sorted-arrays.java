class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length+nums2.length;
        int[] merged = new int[n];
        for(int i=0;i<nums1.length;i++){
          merged[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
          merged[i+nums1.length]=nums2[i];
        }
        Arrays.sort(merged);
        if(n%2==0){
          return (double)(merged[n/2]+merged[n/2-1])/2;
        }
        else {
          return (double)merged[n/2];
        }
    }
}