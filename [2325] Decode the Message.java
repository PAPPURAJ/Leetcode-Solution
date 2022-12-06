class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> hm=new HashMap<>();
        hm.put(' ', ' ');
        StringBuffer sb=new StringBuffer();
        int j=0;
        for(int i=0;i<key.length();i++){
            char c=key.charAt(i);
            if(c!=' ' && hm.get(c)==null)
                hm.putIfAbsent(c, (char)(97+j++));
        }
           
        for(char c:message.toCharArray())
            sb.append(hm.get(c));
        return sb.toString();
    }
}
