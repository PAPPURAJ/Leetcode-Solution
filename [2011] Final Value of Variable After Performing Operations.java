class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int out=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].contains("++"))
                out++;
            else if(operations[i].contains("--"))
                out--;
                
        }return out;
        
    }
}
