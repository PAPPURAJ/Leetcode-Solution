//Slow version

class Solution {
    public int firstUniqChar(String s) {
        char[] in=s.toCharArray();
        char cc='=';

        HashMap<Character,Integer> hm=new LinkedHashMap<>();
        for(char c:in)
            hm.put(c, hm.getOrDefault(c, 0)+1);
        
        for(HashMap.Entry<Character,Integer> en:hm.entrySet()){
              if(en.getValue()==1){
                    cc=en.getKey();
                    break;
                }
        }
              
        for(int i=0;i<in.length;i++)
                if(cc==in[i])
                    return i;
        return -1;
    }
}


//Fast Version

class Solution {
    public int firstUniqChar(String s) {
        int ans=Integer.MAX_VALUE;
        
        for(char c='a';c<='z';c++){
            int firstIndex=s.indexOf(c);
            int lastIndex=s.lastIndexOf(c);

            if(firstIndex==-1)
                continue;
            if(firstIndex==lastIndex) 
                ans=Math.min(ans, firstIndex);
  
        }
        return ans==Integer.MAX_VALUE? -1 : ans;
    }
}
