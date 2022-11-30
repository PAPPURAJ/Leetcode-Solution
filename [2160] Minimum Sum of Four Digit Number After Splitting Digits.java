class Solution {
    public int minimumSum(int num) {
        int [] in=new int[4];
        
        for(int i=0;num>0;i++){
            in[i]=num%10;
            num/=10;
        }
        
        Arrays.sort(in);
        return in[0]*10+in[1]*10+in[2]+in[3];
    }
}
