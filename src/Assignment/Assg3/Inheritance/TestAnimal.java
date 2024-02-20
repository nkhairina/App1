package Assignment.Assg3.Inheritance;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat", "meow");
        animal.makeSound();

        Dog dog = new Dog("Max");
        dog.makeSound();
    }
}