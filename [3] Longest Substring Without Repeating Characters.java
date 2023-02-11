class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] c=s.toCharArray();
        int l=0,r=0,n=c.length,out=0;
        HashSet<Character> hs=new HashSet<>();
        while(r<n){
            if(!hs.contains(c[r])){
                hs.add(c[r]);
                r++;
            }else{
                hs.remove(c[l]);
                l++;
            }
            out=Math.max(hs.size(), out);
        }
        return out;
    }
}
