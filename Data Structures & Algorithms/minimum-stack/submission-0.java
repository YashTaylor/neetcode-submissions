class MinStack {

    class Pair {
        int value;
        int min;

        Pair(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }

    Stack<Pair> stack;

    public MinStack() {
        stack = new Stack();
    }
    
    public void push(int val) {
        if(stack.isEmpty()) {
            stack.push(new Pair(val, val));
        } else {
            int currentMin = Math.min(val, stack.peek().min);
            stack.push(new Pair(val, currentMin));
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().value;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
}
