class Solution {
    public char repeatedCharacter(String s) {
    Set<Character> hs=new HashSet<>();
    char c='a';
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);

            if(hs.contains(c))
                return c; 
            
            hs.add(c);
                    
        }   return c; 
        
    }
}
