// StackModule.java
import java.util.*;

class StackModule {
    public static void menu(Scanner sc) {
        Stack<Integer> stack = new Stack<>();
        while (true) {
            System.out.println("\n-- Stack Operations --");
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Display\n5. Back");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter value to push: ");
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    if (!stack.isEmpty()) System.out.println("Popped: " + stack.pop());
                    else System.out.println("Stack is empty");
                    break;
                case 3:
                    if (!stack.isEmpty()) System.out.println("Top: " + stack.peek());
                    else System.out.println("Stack is empty");
                    break;
                case 4:
                    System.out.println("Stack: " + stack);
                    break;
                case 5:
                    return;
            }
        }
    }
}
