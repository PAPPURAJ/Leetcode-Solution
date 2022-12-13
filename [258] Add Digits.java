class Solution {

    int sum(int n){
        int o=0;
        while(n>0){
            o+=n%10;
            n/=10;
        }return o;
    }

    public int addDigits(int num) {
        while(num>9)
            num=sum(num);
        return num;
    }
}
