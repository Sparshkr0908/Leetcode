class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];  
        for (char ch : word.toCharArray()){ 
            freq[ch - 'a']++; } 
            Arrays.sort(freq); 
            int totalPushes = 0; 
            int pushCount = 1; 
            int charactersAssigned = 0; 
            for (int i = 25; i >= 0; i--){ 
                if (freq[i] == 0){
                    continue;
                } 
                totalPushes += freq[i] * pushCount; charactersAssigned++;  
                if (charactersAssigned % 8 == 0){ 
                    pushCount++; 
                }
            } 
            return totalPushes;
    }
}