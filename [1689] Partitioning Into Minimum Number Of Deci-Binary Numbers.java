class Solution {
    public int minPartitions(String n) {
        char a='0';
        for(int i=0;i<n.length();i++)
            if(a<n.charAt(i))
                a=n.charAt(i);
        return a-48;    
    }
}
