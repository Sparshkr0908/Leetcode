class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0 || s.charAt(0) == '0') return 0;
        int prev2 = 1, prev1 = 1;
        for (int i = 1; i < n; i++) {
            char cur = s.charAt(i), pre = s.charAt(i - 1);
            int now = 0;
            if (cur != '0') now += prev1;
            int duo = (pre - '0') * 10 + (cur - '0');
            if (duo >= 10 && duo <= 26) now += prev2;
                prev2 = prev1;
                prev1 = now;
            if (prev1 == 0 && cur == '0' && !(pre == '1' || pre == '2')) return 0;
        }
        return prev1;
    }
}