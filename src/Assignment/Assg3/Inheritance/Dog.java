package Assignment.Assg3.Inheritance;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, "bark");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks!");
    }
}
