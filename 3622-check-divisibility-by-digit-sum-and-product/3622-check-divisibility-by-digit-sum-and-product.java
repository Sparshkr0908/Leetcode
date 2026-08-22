class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int product = 1;
        while (temp>0){
            int mod = temp % 10;
            sum = sum + mod;
            product = product * mod;
            temp = temp/10;
        }
        int ans = sum + product;
        return n%ans == 0;
    }
}