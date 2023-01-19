class MyQueue {

    Stack<Integer> s,t;

    public MyQueue() {
        s=new Stack<>();
    }
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        t=new Stack<>();
        while(s.size()>1)
            t.add(s.pop());

        
            
        int v = s.pop();
        while(!t.isEmpty())
            s.add(t.pop());   
        return v;    

    }
    
    public int peek() {
        t=(Stack)s.clone();
        int val=0;
        while(!t.isEmpty())
            val=t.pop();
        return val;    
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
