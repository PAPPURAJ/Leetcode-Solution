class Solution {
    public String replaceDigits(String s) {
        
        StringBuffer sb=new StringBuffer();
        char c;

        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c>='0' && c<='9')
                sb.append((char)(s.charAt(i-1)+(c-48)));
            else
                 sb.append(s.charAt(i));

        }
        return sb.toString();
        
    }
}
