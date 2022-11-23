class Solution {
    public String reversePrefix(String word, char ch) {
        char[] in=word.toCharArray();
        int c=word.indexOf(ch);
        if(c<0)
            return word;

        for(int i=0;i<(c+1)/2;i++){
            char t=in[i];
            in[i]=in[c-i];
            in[c-i]=t;

        }return String.valueOf(in);
        
    }
}
