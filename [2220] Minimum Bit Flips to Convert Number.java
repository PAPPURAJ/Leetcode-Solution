// Without buildin 

class Solution {
    public int minBitFlips(int start, int goal) {
        char[] a=Integer.toBinaryString(start).toCharArray();
        char[] b=Integer.toBinaryString(goal).toCharArray();

        int p=a.length-1;
        int q=b.length-1;
        int ans=0;

        while(p>-1 && q>-1){
                if(a[p]!=b[q])ans++;
                 --p;--q;
        }

        while(p>-1){
            if(a[p--]=='1')ans++;
        }

        while(q>-1){
            if(b[q--]=='1')ans++;
        }
        
        return ans;
    }
}







//Using buildin

class Solution {
    public int minBitFlips(int start, int goal) {
        return Integer.bitCount(goal^start);
    }
}
