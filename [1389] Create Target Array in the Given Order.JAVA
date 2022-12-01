class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> li=new ArrayList();
        for(int i=0;i<nums.length;i++)
            li.add(index[i],nums[i]);
        return li.stream().mapToInt(i->i).toArray();      
    }
}
