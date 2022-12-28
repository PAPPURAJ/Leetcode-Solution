class Solution {
    public int minStoneSum(int[] p, int k) {
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        int out=0;
        for(int i:p)
            tm.put(i,tm.getOrDefault(i,0)+1);

        while(k--!=0){
            int t=tm.lastKey();
            if(tm.get(t)==1)
                tm.remove(t);
            else
                tm.replace(t,tm.get(t)-1);    
            tm.put(t-t/2,tm.getOrDefault(t-t/2,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> m:tm.entrySet())
            out+=(m.getKey()*m.getValue());
             
        return out;        
    }
}
