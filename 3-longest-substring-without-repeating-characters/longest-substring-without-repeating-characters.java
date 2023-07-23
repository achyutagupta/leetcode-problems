class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int maxlength =0;
        int n = s.length();
        String str ="";
        for(int i=0;i<n;i++){
          char ch = s.charAt(i);
          CharSequence seq = new StringBuilder(1).append(ch);
          if(str.contains(seq)){
            int index = str.indexOf(ch);
            length = str.length()-index;
            str=str.substring(index+1)+ch;
            System.out.println(str+" "+length);
          }
          else{
            length++;
            maxlength = Math.max(maxlength , length);
            str = str + ch;
          }
        }
        return maxlength;
    }
}