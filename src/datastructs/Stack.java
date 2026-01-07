package datastructs;

public class Stack {
    private Object[] stack;
    private int top = 0;

    public Stack(int maxCap) {
        stack = new Object[maxCap];
    }

    public void insert(Object data) {
        if (isFull()) return;
        stack[top] = data;
        top++;
    }

    public void remove() {
        if (isEmpty()) return;
        top--;
        stack[top] = null;
    }

    public void displayStack() {
        for (int i = 0; i < top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public int getLength() {
        return top;
    }

    private boolean isEmpty() {
        return top == 0;
    }

    private boolean isFull() {
        return top == stack.length;
    }
}
