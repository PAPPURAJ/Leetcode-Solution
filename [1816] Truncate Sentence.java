class Solution {
    int sp=0;
    String out="";
    char c;

    public String truncateSentence(String s, int k) {
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c==' ')sp++;
            if(sp==k)break;
            out+=String.valueOf(c);
        }
        return out;
    }
}
