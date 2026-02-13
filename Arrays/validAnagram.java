class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n!=m)
            return false;
        int[] freq = new int[26];
        for(char c : s.toCharArray())
            freq[c - 'a'] += 1;
        for(char c : t.toCharArray())
            freq[c - 'a'] -= 1;
        for(int num: freq) {
            if(num!=0)  return false;
        }
        return true;
    }
}
