class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len=candies.length,lar=Integer.MIN_VALUE;
        List<Boolean> list=new ArrayList<>();
        

        for(int i:candies)
            if(lar<i)
                lar=i;
        for(int i:candies)
            list.add(i+extraCandies>=lar);
        return list;             
    }
}
