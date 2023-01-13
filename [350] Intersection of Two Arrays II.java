import java.util.*;
class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {

    Vector<Integer> n1=new Vector<>();
    Vector<Integer> n2=new Vector<>();
    Vector<Integer> out=new Vector<>();

    for(int i:nums1)
      n1.add(i);
    for(int i:nums2)  
      n2.add(i);
      
      while(!n1.isEmpty() && !n2.isEmpty()){
        int v=n1.get(0);
        if(n2.contains(v)){
          n2.removeElement(v);
          out.add(v);
        }
        n1.removeElement(v);
      }
      return out.stream().mapToInt(s->s).toArray();
    }
}
