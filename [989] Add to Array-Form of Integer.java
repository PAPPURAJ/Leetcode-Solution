class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> li=new ArrayList<>();
        List<Integer> out=new ArrayList<>();
        int c=0;

        for(int i=num.length-1;i>=0;i--){
            c+=num[i]+(k%10);
            k/=10;
            li.add(c%10);
            c/=10;
        }
        while(k>0 || c!=0){
            c+=(k%10);
            li.add(c%10);
            c/=10;
            k/=10;
        }
        
        for(int i=li.size()-1;i>-1;i--)
            out.add(li.get(i));
        
        return out;
    }
}
