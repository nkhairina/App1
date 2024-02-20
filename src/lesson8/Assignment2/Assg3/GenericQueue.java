package lesson8.Assignment2.Assg3;

import java.util.LinkedList;

public class GenericQueue<T> {
    private LinkedList<T> queue;

    public GenericQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T item) {
        queue.addLast(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        GenericQueue<Integer> intQueue = new GenericQueue<>();
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);

        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.dequeue());
        }

        GenericQueue<String> stringQueue = new GenericQueue<>();
        stringQueue.enqueue("Hello");
        stringQueue.enqueue("World");

        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.dequeue());
        }

        GenericQueue<Boolean> booleanQueue = new GenericQueue<>();
        booleanQueue.enqueue(true);
        booleanQueue.enqueue(false);

        while (!booleanQueue.isEmpty()) {
            System.out.println(booleanQueue.dequeue());
        }
    }
}
