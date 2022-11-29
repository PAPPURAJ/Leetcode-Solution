class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int out=0;
        for(String s:operations){
            if(s.equals("C"))
                stack.pop();
            else if(s.equals("D"))    
                stack.push(stack.peek()*2);
            else if(s.equals("+"))
                stack.push(stack.elementAt(stack.size()-1)+stack.elementAt(stack.size()-2));
            else
                stack.push(Integer.parseInt(s));    
        }

        while(stack.size()!=0)
            out+=stack.pop();


        return out; 
        
    }
}
