package Assignment.Assg3.Inheritance;

public class Animal {
    String name;
    String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(name + " makes the sound " + sound);
    }
}