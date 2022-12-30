// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        long int a=1,m,x=n,out=0;

        while(a<=x){
            m=(a+x)/2;
            if(isBadVersion(m)){
                out=m;
                x=m-1;
            }else
                a=m+1;
        }
        return out;
    }
};
