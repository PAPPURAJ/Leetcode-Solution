class Solution {
    public int strStr(String haystack, String needle) {
        int s2l=needle.length();
        if(haystack.length()==needle.length())
            if(haystack.equals(needle))
                return 0;

        for(int i=0;i<haystack.length()-s2l+1;i++){
            if(haystack.substring(i, i+s2l).equals(needle))
                return i;
        }
            
        return -1;        
    }
}
