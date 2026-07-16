class Solution {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);
        int n = pizzas.length;
        int days = n / 4;
        int even = days / 2;
        int odd = days - even;
        
        long result = 0;
        int right = n - 1;
        
        for (int i = 0; i < odd; i++) {
            result += pizzas[right];
            right--;
        }

        for (int i = 0; i < even; i++) {
            right--;               
            result += pizzas[right];  
            right--;
        }
        
        return result;
    }
}