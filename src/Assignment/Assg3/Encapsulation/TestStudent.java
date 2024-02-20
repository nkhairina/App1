package Assignment.Assg3.Encapsulation;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Hanis");
        student.setAge(26);
        student.setRollNumber(123);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Roll Number: " + student.getRollNumber());
    }
}