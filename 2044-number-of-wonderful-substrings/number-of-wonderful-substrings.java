class Solution {
    public long wonderfulSubstrings(String word) {
        int current = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);
        long res = 0;
        for (int i = 0; i < word.length(); i++) {
            current ^= 1 << word.charAt(i) - 'a';
            if (freq.containsKey(current)) {
                res += freq.get(current);
            }
            for (int j = 0; j < 10; j++) {
                if (freq.containsKey(current ^ 1 << j)) {
                    res += freq.get(current ^ 1 << j);
                }
            }
            if (!freq.containsKey(current)) {
                freq.put(current, 0);
            }
            freq.put(current, freq.get(current) + 1);
        }
        return res;
    }
}