class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();

        for(char c:s.toCharArray())
            if(st.empty())
                st.push(c);
            else
                if(st.peek()+1==c || st.peek()+2==c)
                    st.pop();
                else
                    st.push(c);    
            
        return st.isEmpty();
    }
}
