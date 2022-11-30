class Solution {

    boolean checkPal(int n,int base){
    char[] in=Integer.toString(n, base).toCharArray();
        int len=in.length;
        for(int  i=0;i<len/2;i++)
            if(in[i]!=in[len-1-i])
                return false;
        return true;    
    }

    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<n-1;i++)
            if(!checkPal(n, i))
                return false;
        return true;    
    }
}
