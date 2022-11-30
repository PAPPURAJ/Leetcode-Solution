class Solution {
    public int countPrefixes(String[] words, String s) {
        int out=0;
        for(String i:words)
            if(s.startsWith(i))
                out++;
        return out;        
    }
}
