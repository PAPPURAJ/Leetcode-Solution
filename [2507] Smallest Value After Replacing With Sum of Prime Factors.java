class Solution {
    
    
    int cal(int num){
        int out=0;
        for(int i = 2; i< num; i++) {
           while(num%i == 0) {
              out+=i;
              num = num/i;
           }
        }
        if(num >2) {
           out+=num;
        }
        return out;
    }
    
    public int smallestValue(int n) {
        while(n!=cal(n)){
           
            if(n<4)
                return n; 
            n=cal(n);
        }
              
        return n;
    }
}
