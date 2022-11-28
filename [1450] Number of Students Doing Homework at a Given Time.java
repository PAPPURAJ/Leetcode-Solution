class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int out=0;

        for(int i =0;i<startTime.length;i++)
                if(endTime[i]>=queryTime && startTime[i]<=queryTime)out++;
            return out;
    }
}
