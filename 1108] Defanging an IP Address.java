class Solution {
    public String defangIPaddr(String address) {
        String out="";
        char a;

        for(int i=0;i<address.length();i++){
            a=address.charAt(i);
            out+=a=='.'?"[.]":String.valueOf(a);
        }return out;
        
    }
}
