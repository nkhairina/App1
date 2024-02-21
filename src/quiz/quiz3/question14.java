package quiz.quiz3;

interface Blogger {
    default void blog() throws Exception {
        System.out.println("GENERIC");
    }
}

class TravelBlogger implements Blogger {
    @Override
    public void blog() {
        System.out.println("TRAVEL");
    }
}

public class question14 {
    public static void main(String[] args) {
        Blogger blogger = new TravelBlogger(); // Line n1
        ((TravelBlogger) blogger).blog(); // Line n2
    }
}
