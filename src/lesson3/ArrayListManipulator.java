
package lesson3;

import java.util.ArrayList;

public class ArrayListManipulator {

    // private field only can access in the class
    private ArrayList<Integer> arrayList;

    // constructor
    public ArrayListManipulator() {
        arrayList = new ArrayList<>();
    }

    // public method to add value into the private field "arrayList"
    public void addElement(int element) {
        arrayList.add(element);
    }

    // remove particular element in an array (take obj as argument)
    public void removeByElement(int element) {
        arrayList.remove(Integer.valueOf(element));
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
        for (int element : this.arrayList) {
            System.out.printf("%d ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayListManipulator arrayListManipulator = new ArrayListManipulator();

        arrayListManipulator.addElement(4);
        arrayListManipulator.addElement(3);
        arrayListManipulator.addElement(2);
        arrayListManipulator.addElement(5);
        arrayListManipulator.addElement(1);
        System.out.print("Before: ");
        arrayListManipulator.display();

        // arrayListManipulator.removeByElement(2);
        // arrayListManipulator.removeByIndex(0);
        arrayListManipulator.sortArray();
        System.out.print("After:  ");
        arrayListManipulator.display();

    }

}
