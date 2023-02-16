class Solution {
    public double average(int[] salary) 	{
       double l=Integer.MAX_VALUE,h=Integer.MIN_VALUE,t=0;
        for(int i:salary){
            l=Math.min(l,i);
            h=Math.max(h,i);
            t+=i;
        }
        return (t-l-h)/(salary.length-2);
    }
}
