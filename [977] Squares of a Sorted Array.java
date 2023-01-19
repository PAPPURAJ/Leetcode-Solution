//Using Priority Queue
class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((i,j)->(i-j));
        for(int i:nums)
            pq.add(i*i);
        for(int i=0;i<nums.length;i++){
            nums[i]=pq.poll();
        }
        return nums;
    }
}


//Normal Sort
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++)
            nums[i]*=nums[i];
        Arrays.sort(nums);
        return nums;
    }
}
