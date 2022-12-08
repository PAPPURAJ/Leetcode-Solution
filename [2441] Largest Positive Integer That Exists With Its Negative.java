class Solution {
    public int findMaxK(int[] nums) {
        TreeMap<Integer,Integer> t=new TreeMap<>();
        
        for(int i:nums)t.put(i, i);

        for(Integer i:t.descendingKeySet())
              if(i==-t.getOrDefault(-i, 0))
                return i;
        return -1;
    }
}
