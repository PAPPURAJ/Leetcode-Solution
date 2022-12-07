class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer,Integer> hm=new TreeMap<>();
        List<List<Integer>> out=new ArrayList<>();

        for(int[] i:items1)
            hm.put(i[0], i[1]);
        for(int[] i:items2)
            hm.put(i[0], i[1]+hm.getOrDefault(i[0], 0));

        for(Integer i :hm.keySet())
            out.add(Arrays.asList(i,hm.get(i)));
        
            
        return out;
    }
}
