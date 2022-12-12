class Solution {
    public String reverseOnlyLetters(String s) {
        char[] in=s.toCharArray();
        int i=0,j=in.length-1;
        char t;

        while(i<j){
            while(i<in.length-1 && !((in[i]>='A') && (in[i]<='Z') ||(in[i]>='a') && (in[i]<='z')))
                i++;
            while(j>0 && !((in[j]>='A') && (in[j]<='Z') ||(in[j]>='a') && (in[j]<='z')))
                j--;
            if(i>=j)break;
            t=in[i];
            in[i++]=in[j];
            in[j--]=t;

        }

        return String.valueOf(in);
    }
}
