class Solution {
    public char findTheDifference(String s, String t) {
        int out=0;
        for(char c:t.toCharArray())
            out+=c;
        for(char c:s.toCharArray())
            out-=c;
        return (char) out;
    }
}
