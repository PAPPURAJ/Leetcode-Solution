class Solution {
    public String reverseWords(String s) {
        String[] in=s.split(" ");
        StringBuilder sBuilder=new StringBuilder();
        
        for(String a: in){
            sBuilder.append(new StringBuilder(a).reverse().toString()+" ");
        }
    return sBuilder.deleteCharAt(sBuilder.length()-1).toString();
    }
}
