class MyStack {

    Queue<Integer> queue,t;

    public MyStack() {
        queue=new LinkedList<>();
        t=new LinkedList<>();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        int v=-1;
        while(!queue.isEmpty()){
            v=queue.poll();
            if(!queue.isEmpty())
             t.add(v);
        }
        while(!t.isEmpty())
             queue.add(t.poll());   
        return v;
    }
    
    public int top() {
        int v=-1;
        Iterator<Integer> i=queue.iterator();
        while(i.hasNext())
            v=i.next();
        return v;
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
