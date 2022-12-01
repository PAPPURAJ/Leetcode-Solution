class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        HashMap<Integer,Integer> hMap=new HashMap<>();
        int len=nums.length,t=0;
        int[] st=Arrays.copyOf(nums, len);
        Arrays.sort(st);

        for(int i=0;i<len;i++){
            t=i;
            while(t>-1 && st[i]==st[t])
                t--;
            hMap.put(st[i], t+1);
        }

        
        for(int i=0;i<len;i++)
             st[i]=hMap.get(nums[i]);
        return st;
        
    }
}
