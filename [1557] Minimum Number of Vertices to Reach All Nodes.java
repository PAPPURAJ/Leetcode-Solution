//Code (Without Set)
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

        List<Integer> out=new ArrayList<>();
        int[] in=new int[n];

        for(List<Integer> l:edges)
                in[l.get(1)]++;
        
        for(int i=0;i<n;i++)
            if(in[i]==0)
                out.add(i);
        
        return out;

    }
}


//Code (Using Set)
class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

        Set<Integer> li=new HashSet<>();
        for(List<Integer> l:edges){
                li.add(l.get(0));
        }
        for(List<Integer> l:edges){
            li.remove(l.get(1));
        }
        return li.stream().collect(Collectors.toList());

    }
}
