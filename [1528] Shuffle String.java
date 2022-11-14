class Solution {
    public String restoreString(String s, int[] indices) {
        int len=indices.length;
        char[] out=new char[len]; 

        for(int i=0;i<len;i++){
            out[indices[i]]=s.charAt(i);
            
        }
    return new String(out);
    }
}
