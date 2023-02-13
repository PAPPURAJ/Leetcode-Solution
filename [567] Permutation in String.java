class Solution {

    public boolean checkInclusion(String s1, String s2) {
        int a=s1.length(),b=s2.length();
        if(a>b)return false;
        int[] x=new int[26];
        int[] y=new int[26];

        for(char c:s1.toCharArray()) x[c-97]++;
        for(int i=0;i<b;i++){
            y[s2.charAt(i)-97]++;
            if(i>=a)
                y[s2.charAt(i-a)-97]--;
            if(Arrays.equals(x, y))return true;
        }
        
       return false;        
    }
}
