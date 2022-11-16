//Faster Code

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="",s2="";
        
        for(int i=0;i<word1.length;i++)
            s1+=word1[i];
        for(int i=0;i<word2.length;i++)
            s2+=word2[i];
          
        return s1.equals(s2);
    }
}





//---------------------------------------------------



//Slower Code

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return Arrays.toString(word1).replaceAll("[,\\s]", "").equals(Arrays.toString(word2).replaceAll("[,\\s]", ""));
    }
}
