class Solution {
    public int appendCharacters(String s, String t) {
        int i=0,j=0;
        int sl = s.length() , tl = t.length();
        while((i!=sl)&&(j!=tl)){
           if(s.charAt(i)==t.charAt(j)){
            j++;
           }
            i++;
        }
        return (tl-j);
    }
}