class Solution {
    public String smallestSubsequence(String s) {
        int[] lastOccurrence = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }
        
        boolean[] inStack = new boolean[26];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (inStack[c - 'a']) {
                continue;
            }
            while (sb.length() > 0 && c < sb.charAt(sb.length() - 1) && lastOccurrence[sb.charAt(sb.length() - 1) - 'a'] > i) {
                
                char poppedChar = sb.charAt(sb.length() - 1);
                inStack[poppedChar - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
            
            sb.append(c);
            inStack[c - 'a'] = true;
        }
        
        return sb.toString();
    }
}