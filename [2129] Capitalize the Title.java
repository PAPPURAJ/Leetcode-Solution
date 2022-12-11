  class Solution {
    public String capitalizeTitle(String title) {
        String[] in=title.split(" ");
        String out="";

        for(int p=0;p<in.length;p++){
            String i=in[p];
            if(i.length()<3)
                out+=i.toLowerCase();
            else{
                out+=String.valueOf(i.charAt(0)>='a' && i.charAt(0)<='z'?(char)(i.charAt(0)-32):i.charAt(0));
                out+=i.subSequence(1, i.length()).toString().toLowerCase();
            }
            if(p<in.length-1)
                out+=" ";
        }
        return out;
       
    }
}
