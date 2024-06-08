package lesson6;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> elements = new Stack<>(3);
        elements.push(12);
        elements.push(null);
        elements.push(23);
        System.out.println(elements.pop());
        System.out.println(elements.pop());
        System.out.println(elements.pop());
        System.out.println("elements = " + elements);
    }
}
