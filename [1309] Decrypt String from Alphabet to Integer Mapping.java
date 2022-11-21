class Solution {
    public String freqAlphabets(String s) {
        StringBuffer sb=new StringBuffer();

        for(int i=0;i<s.length();i++){
            
            if(i+2<s.length() && s.charAt(i+2)=='#'){
                sb.append((char)(Integer.parseInt(s.charAt(i)+""+s.charAt(i+1))+96));
                i+=2;
            }else
            sb.append((char)(s.charAt(i)+48));
        }
        return sb.toString();
    }
}
