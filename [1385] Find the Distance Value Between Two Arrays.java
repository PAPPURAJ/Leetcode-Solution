class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int out=0,t;
        boolean f=true;
        for(int i:arr1){
            f=true;
             for(int j:arr2){
                t=Math.abs(i-j);
                if(t<=d){
                    f=false;
                    break;
                }
            }
            if(f)out++;
        }

                
        return out;        
    }
}
