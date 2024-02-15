package quiz.quiz2.question19;

// Correct Implementation
public class C implements I1 {
    public void m1() {
    }
}

// public class C implements I1 { public void m1() throws
// java.io.FileNotFoundException{} } // FileNotFoundException is subclass of
// IOException

// public class C implements I1 { public void m1() throws java.io.IOException{}
// } // throws the same Exception

// Incorrect Implementation
// public class C implements I1 { public void m1() throws Exception {} } //
// throws general exception