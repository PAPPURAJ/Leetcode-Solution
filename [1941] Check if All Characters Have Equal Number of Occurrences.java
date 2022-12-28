//Using TreeMap

class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] a=new int[26];

        for(char c:s.toCharArray()){
            a[(int)(c-'a')]++;
        }
        Arrays.sort(a);
        for(int i=25;i>0;i--){
            if(a[i-1]==0)return true;
            else if(a[i]!=a[i-1]) return false;
        }
        return true;
        
    }
}



//Using PriorityQueue
class Solution {
    public int minStoneSum(int[] p, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((x,y)->y-x);
        int out=0;
        for(int i:p){
            pq.add(i);
            out+=i;
        }
            

        while(k--!=0){
            int t=pq.peek();
            out-=t/2;
            pq.remove(t);
            pq.add(t-t/2);
        }
        

        return out;        
    }
}
