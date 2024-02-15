package quiz.quiz2;

abstract class question16 {
    int num = 100;
    String operation = null;

    protected abstract void help();

    protected void log() {
        System.out.println("Helper-log");
    }

}

public class logquestion16 {
    private int num = 200;
    String operation = "LOGGING";

    void help() {
        System.out.println("LogHelper-help");
    }

    void log() {
        System.out.println("LogHelper-log");
    }

    public static void main(String[] args) {
        new logquestion16().help();
    }
}
