// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int length = 0;
//         int maxlength =0;
//         int n = s.length();
//         String str ="";
//         for(int i=0;i<n;i++){
//           char ch = s.charAt(i);
//           CharSequence seq = new StringBuilder(1).append(ch);
//           if(str.contains(seq)){
//             int index = str.indexOf(ch);
//             length = str.length()-index;
//             str=str.substring(index+1)+ch;
//             System.out.println(str+" "+length);
//           }
//           else{
//             length++;
//             maxlength = Math.max(maxlength , length);
//             str = str + ch;
//           }
//         }
//         return maxlength;
//     }
// }
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int startIndex = 0;

        HashMap<Character, Integer> charMap = new HashMap<>();

        for (int endIndex = 0; endIndex < n; endIndex++) {
            char ch = s.charAt(endIndex);

            if (charMap.containsKey(ch)) {
                startIndex = Math.max(startIndex, charMap.get(ch) + 1);
            }

            charMap.put(ch, endIndex);
            maxLength = Math.max(maxLength, endIndex - startIndex + 1);
        }

        return maxLength;
    }
}
