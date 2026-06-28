class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] frequency = new int[26];
        int n = s.length();
        for(int i = 0; i < n; i++) {
            frequency[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < n; i++) {
            frequency[t.charAt(i) - 'a']--;
        }

        for(int num : frequency) {
            if(num != 0) return false;
        }
        return true;
    }
}
