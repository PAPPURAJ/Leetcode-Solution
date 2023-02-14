class Solution {
public:
    int hammingWeight(uint32_t n) {
       int out=0;
       for(;n!=0;n=n>>1)out+=(n&1);
       return out;  
    }
};
