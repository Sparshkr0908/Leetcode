class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s == null){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int maxlength = 0;
        int left = 0;

        for(int right = 0; right <s.length(); right++){
            char currentchar = s.charAt(right);
            if(map.containsKey(currentchar) && map.get(currentchar) >= left){
                left = map.get(currentchar) + 1;
            }

            map.put(currentchar, right);
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }
}