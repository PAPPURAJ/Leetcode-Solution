class Solution {
    public List<String> cellsInRange(String s) {
        List<String> li=new ArrayList<>();

        for(char i=s.charAt(0);i<=s.charAt(3);i++)
            for(int j=s.charAt(1)-48;j<=s.charAt(4)-48;j++)
                li.add(i+""+j);
        
     return li;            
    }
}
