// class Solution {
//     public int maxConsecutiveAnswers(String ak, int k) {
//        return Math.max(check(ak,k,'T') , check(ak , k ,'F') ); 
//     }
//     public int check(String ak , int k , char ch){
//       int n=ak.length();
//       int sp=0;
//       int maxans=0;
//       int ans=0;
//       for(int i=0;i<n;i++){
//         if(ak.charAt(i)==ch){
//           ans++;
//         }
//         else{
//           k--;
//           if(k>=0){
//             ans++;
//           }
//           else{
//             sp=i;
//             maxans=Math.max(maxans , ans);
//             System.out.println(maxans+" "+ans);
//             ans=0;
//           }
//         }
//       }
//       return Math.max(maxans , ans);
//     }
// }
class Solution {
  public int maxConsecutiveAnswers(String ak, int k) {
    int n = ak.length();
    int[] count = new int[2];
    int maxAns = 0;
    int sp = 0;
    for (int ep = 0; ep < n; ep++) {
      int currentCharIndex = ak.charAt(ep) == 'T' ? 1 : 0;
      count[currentCharIndex]++;
      while (Math.min(count[0], count[1]) > k) {
        int windowStartCharIndex = ak.charAt(sp) == 'T' ? 1 : 0;
        count[windowStartCharIndex]--;
        sp++;
      }
      maxAns = Math.max(maxAns, ep - sp + 1);
    }
    return maxAns;
  }
}
