public class GenericStackClient {
    private static void stackOfString() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("M16");
        stack.push("M60");
        stack.push("Grenade");
        stack.push("Car-15");
        System.out.println("Size of stack after push: " + stack.size());
        System.out.println("Pop element from stack: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Size of stack after pop: " + stack.size());
    }
    private static void stackOfInteger() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Size of stack after push: " + stack.size());
        System.out.println("Pop element from stack: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Size of stack after pop: " + stack.size());
    }
    public static void main(String[] args) {
        System.out.println("Stack of integer: ");
        stackOfInteger();
        System.out.println("Stack of String: ");
        stackOfString();
    }
}
