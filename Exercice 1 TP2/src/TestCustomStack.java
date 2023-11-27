public class TestCustomStack {
    public static void main(String[] arg) {
    CustomStack stack = new CustomStack(4);

    System.out.println("Is stack empty? " + stack.stackIsEmpty());

    stack.addElement(10);
    stack.addElement(20);
    stack.addElement(30);

    System.out.println("Last in stack:" + stack.lastInStack());
    System.out.println("Is stack empty? " + stack.stackIsEmpty());
    System.out.println("Is stack full? " + stack.stackIsFull());

    stack.removeElement();
    stack.removeElement();
    stack.removeElement();

    System.out.println("Is stack empty? " + stack.stackIsEmpty());
    }
}