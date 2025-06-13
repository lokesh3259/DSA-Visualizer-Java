// QueueModule.java
import java.util.*;

class QueueModule {
    public static void menu(Scanner sc) {
        Queue<Integer> queue = new LinkedList<>();
        while (true) {
            System.out.println("\n-- Queue Operations --");
            System.out.println("1. Enqueue\n2. Dequeue\n3. Peek\n4. Display\n5. Back");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    queue.add(sc.nextInt());
                    break;
                case 2:
                    if (!queue.isEmpty()) System.out.println("Dequeued: " + queue.remove());
                    else System.out.println("Queue is empty");
                    break;
                case 3:
                    if (!queue.isEmpty()) System.out.println("Front: " + queue.peek());
                    else System.out.println("Queue is empty");
                    break;
                case 4:
                    System.out.println("Queue: " + queue);
                    break;
                case 5:
                    return;
            }
        }
    }
}