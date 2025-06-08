// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose a Data Structure:");
            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. Linked List");
            System.out.println("4. Sorting Algorithms");
            System.out.println("5. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    StackModule.menu(sc);
                    break;
                case 2:
                    QueueModule.menu(sc);
                    break;
                case 3:
                    LinkedListModule.menu(sc);
                    break;
                case 4:
                    SortModule.menu(sc);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

// // StackModule.java
// import java.util.*;

// class StackModule {
//     public static void menu(Scanner sc) {
//         Stack<Integer> stack = new Stack<>();
//         while (true) {
//             System.out.println("\n-- Stack Operations --");
//             System.out.println("1. Push\n2. Pop\n3. Peek\n4. Display\n5. Back");
//             int ch = sc.nextInt();
//             switch (ch) {
//                 case 1:
//                     System.out.print("Enter value to push: ");
//                     stack.push(sc.nextInt());
//                     break;
//                 case 2:
//                     if (!stack.isEmpty()) System.out.println("Popped: " + stack.pop());
//                     else System.out.println("Stack is empty");
//                     break;
//                 case 3:
//                     if (!stack.isEmpty()) System.out.println("Top: " + stack.peek());
//                     else System.out.println("Stack is empty");
//                     break;
//                 case 4:
//                     System.out.println("Stack: " + stack);
//                     break;
//                 case 5:
//                     return;
//             }
//         }
//     }
// }

// // QueueModule.java
// import java.util.*;

// class QueueModule {
//     public static void menu(Scanner sc) {
//         Queue<Integer> queue = new LinkedList<>();
//         while (true) {
//             System.out.println("\n-- Queue Operations --");
//             System.out.println("1. Enqueue\n2. Dequeue\n3. Peek\n4. Display\n5. Back");
//             int ch = sc.nextInt();
//             switch (ch) {
//                 case 1:
//                     System.out.print("Enter value to enqueue: ");
//                     queue.add(sc.nextInt());
//                     break;
//                 case 2:
//                     if (!queue.isEmpty()) System.out.println("Dequeued: " + queue.remove());
//                     else System.out.println("Queue is empty");
//                     break;
//                 case 3:
//                     if (!queue.isEmpty()) System.out.println("Front: " + queue.peek());
//                     else System.out.println("Queue is empty");
//                     break;
//                 case 4:
//                     System.out.println("Queue: " + queue);
//                     break;
//                 case 5:
//                     return;
//             }
//         }
//     }
// }

// // LinkedListModule.java
// class LinkedListModule {
//     static class Node {
//         int data;
//         Node next;
//         Node(int data) { this.data = data; }
//     }
//     static Node head;

//     public static void menu(Scanner sc) {
//         while (true) {
//             System.out.println("\n-- Linked List Operations --");
//             System.out.println("1. Insert at End\n2. Delete by Position\n3. Display\n4. Reverse\n5. Back");
//             int ch = sc.nextInt();
//             switch (ch) {
//                 case 1:
//                     System.out.print("Enter value to insert: ");
//                     insertAtEnd(sc.nextInt());
//                     break;
//                 case 2:
//                     System.out.print("Enter position: ");
//                     deleteByPosition(sc.nextInt());
//                     break;
//                 case 3:
//                     display();
//                     break;
//                 case 4:
//                     head = reverse(head);
//                     System.out.println("List Reversed");
//                     break;
//                 case 5:
//                     return;
//             }
//         }
//     }

//     static void insertAtEnd(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while (temp.next != null) temp = temp.next;
//         temp.next = newNode;
//     }

//     static void deleteByPosition(int pos) {
//         if (head == null || pos < 0) return;
//         if (pos == 0) {
//             head = head.next;
//             return;
//         }
//         Node temp = head;
//         for (int i = 0; temp != null && i < pos - 1; i++) temp = temp.next;
//         if (temp == null || temp.next == null) return;
//         temp.next = temp.next.next;
//     }

//     static Node reverse(Node head) {
//         Node prev = null;
//         while (head != null) {
//             Node next = head.next;
//             head.next = prev;
//             prev = head;
//             head = next;
//         }
//         return prev;
//     }

//     static void display() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
// }

// // SortModule.java
// import java.util.*;

// class SortModule {
//     public static void menu(Scanner sc) {
//         System.out.print("Enter array size: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter elements:");
//         for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

//         System.out.println("1. Merge Sort\n2. Quick Sort");
//         int ch = sc.nextInt();

//         switch (ch) {
//             case 1:
//                 mergeSort(arr, 0, n - 1);
//                 break;
//             case 2:
//                 quickSort(arr, 0, n - 1);
//                 break;
//         }

//         System.out.println("Sorted Array: " + Arrays.toString(arr));
//     }

//     static void mergeSort(int[] arr, int l, int r) {
//         if (l < r) {
//             int m = l + (r - l) / 2;
//             mergeSort(arr, l, m);
//             mergeSort(arr, m + 1, r);
//             merge(arr, l, m, r);
//         }
//     }

//     static void merge(int[] arr, int l, int m, int r) {
//         int[] left = Arrays.copyOfRange(arr, l, m + 1);
//         int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
//         int i = 0, j = 0, k = l;
//         while (i < left.length && j < right.length) arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
//         while (i < left.length) arr[k++] = left[i++];
//         while (j < right.length) arr[k++] = right[j++];
//     }

//     static void quickSort(int[] arr, int low, int high) {
//         if (low < high) {
//             int pi = partition(arr, low, high);
//             quickSort(arr, low, pi - 1);
//             quickSort(arr, pi + 1, high);
//         }
//     }

//     static int partition(int[] arr, int low, int high) {
//         int pivot = arr[high];
//         int i = low - 1;
//         for (int j = low; j < high; j++) {
//             if (arr[j] <= pivot) {
//                 i++;
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         int temp = arr[i + 1];
//         arr[i + 1] = arr[high];
//         arr[high] = temp;
//         return i + 1;
//     }
// }
