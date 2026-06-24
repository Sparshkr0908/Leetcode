class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;
        
        // Traverse the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = getValue(s.charAt(i));
            
            // Subtraction rule (e.g., 'I' before 'V' -> 4)
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                // Addition rule (e.g., 'V' before 'I' -> 6)
                total += currentValue;
            }
            
            // Update prevValue for the next iteration
            prevValue = currentValue;
        }
        
        return total;
    }
    
    // Helper method to map Roman numerals to integers
    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}