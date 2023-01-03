class Solution {
    public int minDeletionSize(String[] strs) {
        int l=strs[0].length(),out=0;
        for(int i=0;i<l;i++)
            for(int j=0;j<strs.length-1;j++)
                if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                    out++;
                    break;
                }

        return out;
    }
}
