class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      
        HashMap<Character, Integer> magHm=new HashMap<>();
        HashMap<Character, Integer> ransomHm=new HashMap<>();

        for(char c:magazine.toCharArray())
            magHm.put(c, magHm.getOrDefault(c, 0)+1);
        
        for(char c:ransomNote.toCharArray())
            ransomHm.put(c, ransomHm.getOrDefault(c, 0)+1);
        
        for(HashMap.Entry<Character,Integer> en:ransomHm.entrySet())
            if(en.getValue()>magHm.getOrDefault(en.getKey(),0))
                return false;
        return true;        
    }
}
