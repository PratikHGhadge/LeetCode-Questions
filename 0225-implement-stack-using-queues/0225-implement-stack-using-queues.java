class MyStack {
    Queue<Integer> first;
    Queue<Integer> second;
    public MyStack() {
        first = new ArrayDeque<>();
        second = new ArrayDeque<>();
    }
    public void push(int x) {
        first.offer(x);
    }
    public int pop() {
        while(first.size()>1){
            second.offer(first.poll());
        }
        int ans = first.poll();
        while(!second.isEmpty()){
            first.offer(second.poll());
        }
        return ans;
    }
    public int top() {
        while(first.size()!=1){
            second.offer(first.poll());
        }
        int ans = first.peek();
        second.offer(first.poll());
        while(second.size()>0){
            first.offer(second.poll());
        }
        return ans;
    }
    public boolean empty() {
        return first.isEmpty();
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