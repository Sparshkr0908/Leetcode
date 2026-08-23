class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int sumL = 0, sumR = 0, cntL= 0, cntR = 0;
        for(int i =0;i<n/2;i++){
            char c = num.charAt(i);
            if(c == '?') cntL++;
            else{
                sumL += c - '0';
            }
        }

        for(int i=n/2; i<n; i++){
            char c = num.charAt(i);
            if(c == '?') cntR++;
            else {
                sumR += c - '0';
            }
        }

        int diff = sumL - sumR;
        int cnt = cntL + cntR;

        if(cnt % 2 == 1){
            return true;
        }

        return 2 * diff + 9 *(cntL - cntR) != 0;
    }
}