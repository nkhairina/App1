package lesson4;

public class POJOClass {

    public class Person {
        private String name;
        private int age;
        private String email;

        public Person(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }

        // Getter/setter methods will be added here
    }

    public class Main {
        public static void main(String[] args) {
            Person person = new Person("John Doe", 30, "john@example.com");
            // Setting values will be done here
        }
    }

}
