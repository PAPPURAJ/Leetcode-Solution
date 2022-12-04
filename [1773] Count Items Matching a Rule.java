class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int out=0;
        for(List<String> l:items){
            switch(ruleKey){
                case "type":
                    if(l.get(0).equals(ruleValue))out++;
                    break;
                case "color":
                    if(l.get(1).equals(ruleValue))out++;
                    break;
                case "name":
                    if(l.get(2).equals(ruleValue))out++;
                    break;                    
            }

        }return out;
    }
}
