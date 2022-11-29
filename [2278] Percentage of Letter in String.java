class Solution {
    public int percentageLetter(String s, char letter) {
        int t=0,p=0;

        for(char c:s.toCharArray()){
            if(c==letter)
                p++;
            t++;    
        }
        return ((int)((p*100.00)/(t*1.00)));
    }
}
