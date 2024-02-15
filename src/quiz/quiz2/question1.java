package quiz.quiz2;

public class question1 {

    public static void main(String[] args) {
        String str1 = " ";
        boolean b1 = str1.isEmpty();
        System.out.println(b1);
        str1.trim();
        boolean b2 = str1.isEmpty();
        System.out.println(b2);
        explained();
    }

    public static void explained() {
        String str1 = " ";
        boolean b1 = str1.isEmpty();
        System.out.println(b1);
        String str2 = str1.trim();
        boolean b2 = str2.isEmpty();
        System.out.println(b2);
    }
}
