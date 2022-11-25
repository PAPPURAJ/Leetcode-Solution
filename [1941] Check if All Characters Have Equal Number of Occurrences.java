class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] a=new int[26];

        for(char c:s.toCharArray()){
            a[(int)(c-'a')]++;
        }
        Arrays.sort(a);
        for(int i=25;i>0;i--){
            if(a[i-1]==0)return true;
            else if(a[i]!=a[i-1]) return false;
        }
        return true;
        
    }
}
