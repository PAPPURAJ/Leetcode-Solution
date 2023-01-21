class Solution {
  
    public int peakIndexInMountainArray(int[] arr) {
          int out=0,i=0,j=arr.length-1,mid=(i+j)/2;
            while(i<=j){
                if(arr[mid]<arr[mid+1]){
                        i=mid+1;
                        out=mid+1;
                }else if(arr[mid]<arr[mid-1]){
                    j=mid-1;
                    out=mid-1;
                }
                else{
                    out=mid;
                    break;
                }  
                mid=(i+j)/2;

            }

          return out;
    }
}
