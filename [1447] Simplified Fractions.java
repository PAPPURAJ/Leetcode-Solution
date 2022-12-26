class Solution {
        int gcd(int a, int b) {
            return a == 0 ? b : gcd(b % a, a);
         }

    public List<String> simplifiedFractions(int n) {
        List<String> li=new ArrayList<>();

        for(int i=1;i<n;i++)
            for(int j=i+1;j<=n;j++){
                    
                 if (gcd(i,j)!=1) continue;
                 if(i==1 || j%i!=0)
                    li.add(i+"/"+j);
            }
                
               
        return li;

    }
}
