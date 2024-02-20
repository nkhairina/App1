package lesson8.Assignment1.Assg5;

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Luna", 2);
        Bird bird = new Bird("Chirpy", 1);

        dog.eat();
        dog.sleep();
        dog.makeSound();
        System.out.println();

        cat.eat();
        cat.sleep();
        cat.makeSound();
        System.out.println();

        bird.eat();
        bird.sleep();
        bird.makeSound();
        System.out.println();
    }
}