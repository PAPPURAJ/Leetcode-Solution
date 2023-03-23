class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums)
            hs.add(i);
        while(true){
            if(!hs.contains(original))
                break;
            original*=2;    
        }    
        return original;
    }
}
