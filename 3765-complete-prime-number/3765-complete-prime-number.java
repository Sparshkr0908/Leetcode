class Solution {
    public boolean completePrime(int num) {
        String s = Integer.toString(num);
        int n = s.length();
        
        for (int k = 1; k <= n; k++) {
            long prefix = Long.parseLong(s.substring(0, k));
            long suffix = Long.parseLong(s.substring(n - k));
            
            if (!isPrime(prefix) || !isPrime(suffix)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean isPrime(long x) {
        if (x < 2) return false;
        if (x < 4) return true; // 2, 3
        if (x % 2 == 0) return false;
        for (long i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }
}