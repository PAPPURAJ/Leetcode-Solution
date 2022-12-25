class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<words.length;i++){
            if(words[i].equals(target)){
                
                min=Math.min(min,Math.abs(startIndex-i));
                min=Math.min(min, Math.abs(words.length-startIndex+i));
                min=Math.min(min, Math.abs(words.length+startIndex-i));

                    
            }
           
            
        }return min==Integer.MAX_VALUE?-1:min;
        
    }
}
