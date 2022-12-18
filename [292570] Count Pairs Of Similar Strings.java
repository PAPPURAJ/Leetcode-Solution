class Solution {
    public int similarPairs(String[] words) {
        
       int out=0;
        
       for(int i=0;i<words.length;i++){
           TreeSet<Character> hs=new TreeSet<>();   
           String s="";
           for(char c:words[i].toCharArray())
                hs.add(c);
           for(char c:hs)
               s+=String.valueOf(c);
                
           words[i]=s;
       }
       
        for(int i=0;i<words.length-1;i++){
       
            for(int j=i+1;j<words.length;j++)
               if(words[i].equals(words[j]))
                    out++;
            
           
        }
        return out;
    }
}
