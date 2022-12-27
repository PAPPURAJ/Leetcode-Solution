class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int len = capacity.length,t=0;
        
        for ( int i = 0; i < len; i++) 
            capacity[i] -= rocks[i];
        Arrays.sort(capacity);
        
        for (int i = 0; i < len; i++) 
            if (capacity[i] <= 0) 
                t++;
            else 
                if (capacity[i] <= additionalRocks) {
                    additionalRocks -= capacity[i];
                    capacity[i] = 0;
                    t++;
                }
            
        
        return t;
    }
}
