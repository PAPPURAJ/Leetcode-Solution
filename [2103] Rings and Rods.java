class Solution {
    public int countPoints(String rings) {
        String[] t=new String[10];
        int out=0;

        Arrays.fill(t, "");
        
        for(int i=0;i<rings.length();i+=2){
            if(!t[rings.charAt(i+1)-48].contains(String.valueOf(rings.charAt(i))))
                t[rings.charAt(i+1)-48]+=String.valueOf(rings.charAt(i));
        }
        for(String s:t)
            if(s.length()>2)out++;
        return out;
    }
}
