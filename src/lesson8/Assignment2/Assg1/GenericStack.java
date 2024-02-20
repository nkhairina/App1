package lesson8.Assignment2.Assg1;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class GenericStack<T> {
    private ArrayList<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        while (!intStack.isEmpty()) {
            System.out.println(intStack.pop());
        }

        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Hello");
        stringStack.push("World");

        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }

        GenericStack<Double> doubleStack = new GenericStack<>();
        doubleStack.push(3.14);
        doubleStack.push(2.71);

        while (!doubleStack.isEmpty()) {
            System.out.println(doubleStack.pop());
        }
    }
}
