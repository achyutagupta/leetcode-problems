class Solution {
    public int lengthOfLastWord(String s) {
      s=s.trim();
      int n=s.length();
      int i;
      for(i=n-1;i>=0;i--){
        char ch = s.charAt(i);
        if(i==0||ch==' ') break;
      }
      if(i==0) return (n-i);
      return (n-i)-1;    
    }
}