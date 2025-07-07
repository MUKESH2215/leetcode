class MinStack {
    class Node
    {
        int data,min;
        Node next;
        Node(int val,int min,Node next)
        {
            this.data=val;
            this.min=min;
            this.next=next;
        }
    }
    Node start;
    public MinStack() {
        start= null;
    }
    
    public void push(int val) {
        if(start==null)
        {
            start=new Node(val,val,null);
        }
        else
        {
            start=new Node(val,Math.min(val,start.min),start);
        }

    }
    
    public void pop() {
        start=start.next;
    }
    
    public int top() {
        if(start!=null)
        {
        return start.data;
        }
        throw new RuntimeException("Stack is empty");
    }
    
    public int getMin() {
        return start.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */