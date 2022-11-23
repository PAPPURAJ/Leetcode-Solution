//Using set

class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> s=new HashSet<>();

        for(int i=0;i<paths.size();i++){
          s.add(paths.get(i).get(1));
        }
        for(int i=0;i<paths.size();i++){
            s.remove(paths.get(i).get(0));
          }
          
        return s.iterator().next();
    }
}



//Without using set

class Solution {
    public String destCity(List<List<String>> paths) {
        
        for(int i=0;i<paths.size();i++){
            boolean flag=true;
            for(int j=0;j<paths.size();j++){
                if(paths.get(i).get(1).equals(paths.get(j).get(0)))
                    flag=false;
            }
            if(flag)return paths.get(i).get(1);
        }
        return paths.get(0).get(1);
    }
}
