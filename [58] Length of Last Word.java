class Solution {
    public int lengthOfLastWord(String s) {
        int i=0;
        boolean start=false;
        for(int j=s.length()-1;j>-1;j--){
            if(start && s.charAt(j)==' ')break;
            if(s.charAt(j)!=' '){
                start=true;
                i++;
            }
        }
        return i;
    }
}
