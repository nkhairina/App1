package lesson8.Assignment2.Assg6;

import org.w3c.dom.Node;

public class GenericLinkedList<T> {
    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public boolean remove(T item) {
        if (head == null) {
            return false;
        }
        if (head.data.equals(item)) {
            head = head.next;
            size--;
            return true;
        }
        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(item)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Testing GenericLinkedList with different data types
        GenericLinkedList<Integer> intList = new GenericLinkedList<>();
        intList.add(5);
        intList.add(10);
        intList.add(15);
        intList.printList();
        intList.remove(10);
        intList.printList();

        GenericLinkedList<String> stringList = new GenericLinkedList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        stringList.printList();
        stringList.remove("banana");
        stringList.printList();

        GenericLinkedList<Character> charList = new GenericLinkedList<>();
        charList.add('a');
        charList.add('b');
        charList.add('c');
        charList.printList();
        charList.remove('b');
        charList.printList();
    }
}
