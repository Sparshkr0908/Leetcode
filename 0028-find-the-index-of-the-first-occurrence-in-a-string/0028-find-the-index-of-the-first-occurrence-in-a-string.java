class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        int hayLength = haystack.length();

        if(needleLength>hayLength){
            return -1;
        }

        for (int i = 0; i <= hayLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}