class Solution {
    List<List<Integer>> out=new ArrayList<>();

    void trav(int[] nums, int a,int b){
        if(b-a==1){
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<b;i++)
                l.add(nums[i]);
            out.add(l);     
        }
        for(int i=a;i<b;i++){
            int[] t=nums.clone();
            int p=t[a];
            t[a]=t[i];
            t[i]=p;
            trav(t, a+1, b);
        }

    }

    public List<List<Integer>> permute(int[] nums) {
        trav(nums,0,nums.length);
        return out;
    }
}
