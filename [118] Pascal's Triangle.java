class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> out=new ArrayList<>();

        List<Integer> t=new ArrayList<>();
        t.add(1);
        out.add(t);
        
        for(int i=1;i<numRows;i++){
            List<Integer> tt=new ArrayList<>(),p=out.get(i-1); 
            tt.add(1);
            for(int j=1;j<i;j++)
                    tt.add(p.get(j)+p.get(j-1));          
            tt.add(1);
            out.add(tt);
        }
        return out;
        
    }
}
