class Solution {

    boolean chk(int num){
        int t=num;
        while(t>0){
            int d=t%10;
            if(!(d!=0 && num%d==0))
                return false;
            t/=10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> li=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(chk(i))
                li.add(i);
        }
        return li;
    }
}
