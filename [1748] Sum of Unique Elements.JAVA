class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int out=0;
        
        for(int i:nums)
            hm.put(i, hm.get(i)==null?1:hm.get(i)+1);   
        
        for(Integer s:hm.keySet()){
            if(hm.get(s)==1){
                 out+=s;
            }         
        }
        return out;
    }
}
