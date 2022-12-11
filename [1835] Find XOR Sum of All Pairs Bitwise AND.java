class Solution {
    int cal(int[] a,int[] b){
        int out=0,c=0;
        for(int i:a)
            c^=i;
        for(int i:b){
            out^=(i&c);
        }
        return out;

    }

    public int getXORSum(int[] arr1, int[] arr2) {
        return cal(arr1,arr2);        
    }
}
