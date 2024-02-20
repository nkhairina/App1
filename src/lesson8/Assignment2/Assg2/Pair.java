package lesson8.Assignment2.Assg2;

public class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 123);
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());

        pair.setFirst("World");
        pair.setSecond(456);

        System.out.println("Updated First: " + pair.getFirst());
        System.out.println("Updated Second: " + pair.getSecond());
    }
}
