class MinStack {
    private int size = 10;
    private int top = -1;
    private int[] stack = new int[size];
    private int min = Integer.MAX_VALUE; // Initialize min with the maximum possible value

    public MinStack() {
    }

    public void push(int val) {
        if (top == stack.length - 1) {
            int[] temp = new int[2 * stack.length];
            int i = 0;
            while (i <= top) {
                temp[i] = stack[i];
                i++;
            }
            stack = temp;
        }
        stack[++top] = val;
        if (val < min) {
            min = val;
        }
    }

    public void pop() {
        if (top == -1) {
            return;
        }
        // Update min if the element being popped is the current minimum
        if (stack[top] == min) {
            // Find the new minimum in the stack
            min = Integer.MAX_VALUE;
            for (int i = 0; i < top; i++) {
                if (stack[i] < min) {
                    min = stack[i];
                }
            }
        }
        top--;
    }

    public int top() {
        if (top == -1) {
            return -1;
        }
        return stack[top];
    }

    public int getMin() {
        return min;
    }
}