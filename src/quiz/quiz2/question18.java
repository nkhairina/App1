package quiz.quiz2;

class Student {
    // by default the access modifier is public
    String name;
    int age;

    Student() {
        // the correct way to call a constructor in its own class
        this("Firdaus", 23);

        // the incorrect way
        // Student("James",12);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class question18 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }
}
