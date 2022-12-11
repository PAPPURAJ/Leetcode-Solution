class Solution {
    
    public int countWords(String[] words1, String[] words2) {


        HashMap<String,Integer> hm=new HashMap<>();
        HashMap<String,Integer> hm2=new HashMap<>();
        int out=0;
        for(String s:words1)
            hm.put(s, hm.getOrDefault(s, 0)+1);
        for(String s:words2)
            hm2.put(s,hm2.getOrDefault(s, 0)+1);
        
        for(HashMap.Entry<String,Integer> i:hm.entrySet()){
            if(i.getValue()==1 && hm2.getOrDefault(i.getKey(), 0)==1)out++;
        }
        return out;  
        
    }
}
