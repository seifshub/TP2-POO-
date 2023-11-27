
public class CustomStack {
    private int capacity;
    private int[] stack;
    private int topElement;
    public CustomStack(int capacity) {
        this.capacity=capacity;
        this.stack =new int[capacity];
        this.topElement=-1;
    }
    public void addElement(int element) {
        if (!stackIsFull()) {
            System.out.println("Element "+element+" added to top of the stack");
            topElement++;
            stack[topElement]=element;
        } else {
            System.out.println("Stack is full");
        }
    }
    public void removeElement() {
        if (!stackIsEmpty()) {
            System.out.println("Top element remove from stack");
            topElement--;
        } else {
            System.out.println("Stack is empty.");
        }
    }
    public int lastInStack() {
        if (!stackIsEmpty()) {
            return stack[topElement];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public boolean stackIsEmpty() {
        return topElement==-1;
    }
    public boolean stackIsFull() {
        return topElement==capacity-1;
    }
    public void displayStack() {
        if (!stackIsEmpty()) {
            System.out.println("elements:");
            for (int i =0;i<= topElement;i++) {
                System.out.print(" | "+stack[i]);
            }
        } else {
            System.out.println("Stack is empty");
        }
    }
}

