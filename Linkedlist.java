// LinkedListModule.java

import java.util.Scanner;

class Linkedlist {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }
    static Node head;

    public static void menu(Scanner sc) {
        while (true) {
            System.out.println("\n-- Linked List Operations --");
            System.out.println("1. Insert at End\n2. Delete by Position\n3. Display\n4. Reverse\n5. Back");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    insertAtEnd(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter position: ");
                    deleteByPosition(sc.nextInt());
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    head = reverse(head);
                    System.out.println("List Reversed");
                    break;
                case 5:
                    return;
            }
        }
    }

    static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    static void deleteByPosition(int pos) {
        if (head == null || pos < 0) return;
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < pos - 1; i++) temp = temp.next;
        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next;
    }

    static Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
