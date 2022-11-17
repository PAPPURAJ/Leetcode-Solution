//Using set


class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] sym=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String t="";
        Set<String> set=new HashSet<>();

            for(int i=0;i<words.length;i++){
                 for(int j=0;j<words[i].length();j++)
                    t+=sym[words[i].charAt(j)-97];
                    set.add(t);   
                 t="";   
            }
                
        return set.size();
    }
}





//Using ArrayList


class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] sym=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String t="";
        ArrayList<String> arrayList=new ArrayList<>();

            for(int i=0;i<words.length;i++){
                 for(int j=0;j<words[i].length();j++)
                    t+=sym[words[i].charAt(j)-97];
                 if(!arrayList.contains(t))
                    arrayList.add(t);   
                 t="";   
            }
                
        return arrayList.size();
    }
}
