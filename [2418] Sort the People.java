//Without Hashmap

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String t;
        int p;

        for(int i=0;i<heights.length;i++){
            boolean flag=true;
            for(int j=0;j<heights.length-1;j++){
                if(heights[j]<heights[j+1]){
                    p=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=p;
                    t=names[j];
                    names[j]=names[j+1];
                    names[j+1]=t;
                    flag=false;
                }
            }
            if(flag) return names;
            else if(!flag && i+1==heights.length)i=0;
        }return names;
        
    }
}




//Using HashMap
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int h=heights.length;
        HashMap<Integer,String> hMap=new HashMap<>();
        String[] out=new String[h];

        for(int i=0;i<h;i++)
            hMap.put(heights[i], names[i]);
        
        Arrays.sort(heights);

        for(int i=0;i<h;i++){
            out[h-1-i]=hMap.get(heights[i]);
        }
            

        return out;
    }
}
