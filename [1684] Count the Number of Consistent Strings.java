class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int out=0,len=0;

        for(int i=0;i<words.length;i++){
            len=words[i].length();
            while(len-->0){
                if(!allowed.contains(String.valueOf(words[i].charAt(len))))
                    break;

            }
            if(len<0)out++;
        }
        return out;
    }
}
