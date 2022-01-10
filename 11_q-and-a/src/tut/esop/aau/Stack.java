package tut.esop.aau;

public class Stack {
    private final int MAX_STACK_SIZE = 255;
    private final Object DEFAULT_VALUE = null;
    private int top;
    private Object[] stackContainer;

    public Stack() {
        this.stackContainer = new Object[MAX_STACK_SIZE];
        top = -1;
    }

    public void push(Object newTop) {
        if(top < this.stackContainer.length-1) {
            System.out.println("Pushing object to stack");
            stackContainer[++top] = newTop;
        } else {
            System.err.println("Cannot push new object onto stack - max size exceeded");
        }
    }

    public Object pop() {
        Object oldTop = this.stackContainer[this.top];
        this.stackContainer[this.top] = DEFAULT_VALUE;
        top = top - 1;
        return oldTop;
    }

    public Object peek() {
        return this.stackContainer[this.top];
    }

    public void empty() {
        for(int i = 0; i < this.stackContainer.length; i++) {
            this.stackContainer[i] = DEFAULT_VALUE;
        }
        this.top = -1;
    }
}
