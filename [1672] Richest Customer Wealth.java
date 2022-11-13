class Solution {
    public int maximumWealth(int[][] accounts) {
        int lar=0,t=0;
        for(int i=0;i<accounts.length;i++){
            t=0;
            for(int j=0;j<accounts[i].length;j++)
                t+=accounts[i][j];
            if(lar<t) lar=t;
        }return lar;
    }
}
