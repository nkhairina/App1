package lesson3;

import java.util.ArrayList;

public class ArrayListStringManipulator {

    // private field only can access in the class
    private ArrayList<String> arrayList;

    // constructor
    public ArrayListStringManipulator() {
        arrayList = new ArrayList<>();
    }

    // public method to add value into the private field "arrayList"
    public void addElement(String element) {
        arrayList.add(element);
    }

    // remove particular element in an array (take obj as argument)
    public void removeByElement(String element) {
        arrayList.remove(String.valueOf(element));
    }

    // remove particular index in an array (take int as argument)
    public void removeByIndex(int index) {
        arrayList.remove(index);
    }

    public void sortArray() {
        arrayList.sort(null);
    }

    // display all element in the array
    public void display() {
        for (String element : this.arrayList) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayListStringManipulator arrayListStringManipulator = new ArrayListStringManipulator();

        arrayListStringManipulator.addElement("apple");
        arrayListStringManipulator.addElement("banana");
        arrayListStringManipulator.addElement("cherry");
        arrayListStringManipulator.addElement("orange");
        arrayListStringManipulator.addElement("durian");
        System.out.print("Before: ");
        arrayListStringManipulator.display();

        arrayListStringManipulator.removeByElement("apple");
        // arrayListStringManipulator.removeByIndex(0);
        // arrayListStringManipulator.sortArray();
        System.out.print("After:  ");
        arrayListStringManipulator.display();

    }

}
