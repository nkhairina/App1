package quiz.quiz3;

abstract class log {
    abstract long count(); // Line n1

    abstract Object get(); // Line n2
}

class communicationlog extends log {
    int count() { // Line n3
        return 108;
    }

    String get() { // Line n4
        return "com-log";
    }
}

public class question31 {
    public static void main(String[] args) {
        log log = new communicationlog(); // Line n5
        System.out.print(log.count());
        System.out.print(log.get());
    }
}
