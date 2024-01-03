class MinStack {
    int min;
    Stack<int[]> st;
    public MinStack() {
        min=Integer.MAX_VALUE;
        st=new Stack<>();
    }
    public void push(int val) {
        if(val<min)min=val;
        st.push(new int[]{val,min});
    }
    public void pop() {
        st.pop();
        if(!st.isEmpty())
            min=st.peek()[1];
        else min=Integer.MAX_VALUE;
    } 
    public int top() {
        return st.peek()[0];
    }
    public int getMin() {
        return min;
    }
}
