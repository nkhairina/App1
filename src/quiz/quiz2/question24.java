package quiz.quiz2; //24.  Which is not a valid statement based on given code?

public class question24 {

    class A {
        public void methodA() {
            System.out.println("Method from class A");
        }
    }

    class B extends A {
        public void methodB() {
            System.out.println("Method from class B");
        }
    }

    public class Reference {
        public static void main(String[] args) {

            // a. Parent class reference can refer to child class object (polymorphism)
            A a = new B();
            // a.methodA(); // Output: Method from class A (inherited by B)

            // b. No issues with creating objects of the parent class
            A a = new A();
            // a1.methodA(); // Output: Method from class A

            // c. No issues with creating objects of the same class
            B a = new B();
            // b.methodA(); // Output: Method from class A (inherited by B)
            // b.methodB(); // Output: Method from class B

            // d. Child class reference cannot refer to parent class object (compilation
            // error)
            B b = new A(); // This line will cause a compilation error
        }
    }

}
