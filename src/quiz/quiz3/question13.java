package quiz.quiz3;

class Animal {
    String msg = "ANIMAL";

    void makeSound() {
        System.out.println(msg);
    }
}

class Horse extends Animal {
    String msg = "HORSE";

    void makeSound() {
        super.makeSound(); // Call the parent class method
        System.out.println(msg);
    }
}

public class question13 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Horse horse = new Horse();

        animal.makeSound(); // Output: ANIMAL
        horse.makeSound(); // Output: ANIMAL, HORSE
    }
}
