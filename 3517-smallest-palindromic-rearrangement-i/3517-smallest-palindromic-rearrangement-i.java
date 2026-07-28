class Solution {
    public String smallestPalindrome(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }
        
        StringBuilder half = new StringBuilder();
        char mid = '\0';
        
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            int c = cnt[i];
            if (c % 2 != 0) {
                mid = ch;
            }
            for (int j = 0; j < c / 2; j++) {
                half.append(ch);
            }
        }
        
        StringBuilder result = new StringBuilder();
        result.append(half);
        if (mid != '\0') {
            result.append(mid);
        }
        result.append(half.reverse());
        
        return result.toString();
    }
}