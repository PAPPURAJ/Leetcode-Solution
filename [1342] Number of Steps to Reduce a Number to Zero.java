class Solution {
    public int numberOfSteps(int num) {
        int i=0;
        for(;num!=0;i++)
            num=num%2==0?num/2:num-1;
        return i;    
    }
}
