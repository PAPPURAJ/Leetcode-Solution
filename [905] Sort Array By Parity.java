class Solution {
    public int[] sortArrayByParity(int[] nums) {
        LinkedList<Integer> l=new LinkedList<>();
        for(int i:nums){
            if(i%2==0)
                l.addFirst(i);
            else
                l.addLast(i);
        } return l.stream().mapToInt(Integer::intValue).toArray();      
    }
}
