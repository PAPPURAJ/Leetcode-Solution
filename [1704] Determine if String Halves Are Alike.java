class Solution {
    public boolean halvesAreAlike(String s) {
        int a=0,b=0,len=s.length();
        for(int i=0;i<len;i++){
            switch (s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    if(i<len/2)
                        a++;
                    else 
                        b++;    
                        
                    break;
            
                default:
                    break;
            }
        }

     return a==b;   
    }
}
