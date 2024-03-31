class Solution {
    public boolean isPalindrome(String s) {
      String str="";
      int n=s.length();
      for(int i =0;i<n;i++){
        char ch=s.charAt(i);
        if(Character.isLetter(ch)||Character.isDigit(ch)) str = str + ch;
      }
      str=str.toLowerCase();
      if (str.equals("")) return true;
      // System.out.println(str);
      int k = str.length()-1;
      int check =0;
      for(int j=0;j<=(str.length()/2);j++){
        // System.out.println(str.charAt(j)+"--------"+str.charAt(k));
        if(str.charAt(j)!=str.charAt(k)){
          check=-1;
          break;
        }
        k--;
      }
      if(check ==-1)
      return false;
      else{
        return true;
      } 
    }
}