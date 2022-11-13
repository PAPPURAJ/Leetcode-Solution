class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0,t;

        for(int i=0;i<sentences.length;i++){
            t=sentences[i].split(" ").length;
            if(t>max)max=t;
        }return max;
        
    }
}
