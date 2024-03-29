class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();
        for(String s:strs){
          char[] chararr = s.toCharArray();
          Arrays.sort(chararr);
          String sorted = new String(chararr);

          if(!map.containsKey(sorted)){
            map.put(sorted , new LinkedList<String>());
          }
          map.get(sorted).add(s);
        }
        return new LinkedList<>(map.values());
    }
}