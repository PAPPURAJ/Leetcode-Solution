class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character,Integer> hm=new HashMap<>();
        ArrayList<String> al=new ArrayList<>();

        for(char c:"qwertyuiop".toCharArray())
            hm.put(c, 1);
        for(char c:"asdfghjkl".toCharArray())
            hm.put(c, 2);
        for(char c:"zxcvbnm".toCharArray())
            hm.put(c, 3);
        
        for(String s:words){
            char[] c=s.toLowerCase().toCharArray();
            boolean flag=true;
            for(int i=0;i<c.length-1;i++){
                if(hm.getOrDefault(c[i], 0)!=hm.getOrDefault(c[i+1], 0))
                    flag=false;
            }if(flag)al.add(s);
        }
        
        return  al.toArray(new String[al.size()]);
    }
}
