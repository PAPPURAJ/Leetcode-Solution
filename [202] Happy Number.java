class Solution {
    
    public boolean isHappy(int n) {

        Set<Integer> hs=new HashSet<>();

        while(!hs.contains(n)){ 
            hs.add(n);
            int t=0;
            while(n!=0){
                t=t+((n%10)*(n%10));
                n/=10;
            }n=t;
            if(n==1)return true;
        }

        return false;
    }
}
