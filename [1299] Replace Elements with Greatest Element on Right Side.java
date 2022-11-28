//Code (Faster)
class Solution {
    public int[] replaceElements(int[] arr) {
        int len=arr.length-1,it=len-1,t=0,t2;
        while(it>-1){
            t2=Math.max(t, arr[it+1]);
            t=arr[it];
            arr[it--]=t2;
        }
        arr[len]=-1;
        return arr;
    }   
}

//Code (Slower)
class Solution {
    public int[] replaceElements(int[] arr) {
        int len=arr.length;
        int[] out=new int[len];

        for(int i=0;i<len;i++){
            int h=-1;
            for(int j=i+1;j<len;j++)
                if(h<arr[j])h=arr[j];
            out[i]=h;
        }
        return out;    
    }
}
