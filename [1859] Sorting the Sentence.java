//Fastest Solution
class Solution {
    public String sortSentence(String s) {
        String[] in=s.split(" ");
        String[] out=new String[in.length];

        for(int i=0;i<in.length;i++){
            int li=in[i].length()-1;
            out[in[i].charAt(li)-48-1]=in[i].substring(0,li);
        }
        
        return String.join(" ", out);
    }
}



//Slower Solution

class Solution {
    public String sortSentence(String s) {
        String out="";
        boolean flag=true;

        for(int i=1;flag;i++){
            {
                    int spacei=0;
                for(int j=0;j<s.length();j++){
                    flag=false;
                    if(s.charAt(j)==' ')spacei=j+1;
                    if(s.charAt(j)-48==i){
                        out = i==1?out+s.substring(spacei,j):out+" "+s.substring(spacei,j);
                        flag=true;
                        break;
                    }
                    System.out.println(out);
                }
                
                
                
            }
           
        }
        return out;
    }
}
