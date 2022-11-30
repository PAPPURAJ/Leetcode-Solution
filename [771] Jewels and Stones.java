class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int out=0;
        HashMap<Character,Integer> hashMap=new HashMap<>();

        for(char c:stones.toCharArray())
            hashMap.put(c, hashMap.get(c)==null?1:hashMap.get(c)+1);
        

        for(char c:jewels.toCharArray())
            out+=hashMap.get(c)==null?0:hashMap.get(c);

        return out;  
    }
}
