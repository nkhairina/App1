package quiz.quiz3;

public class question23 {

    public static void main(String[] args) {
        String str = "hello";
        String str1 = "ello";
        String str2 = "ello" + new String("world");
        String str3 = "ello world";
        String str4 = "hello".substring(1);
        String str5 = str + " world";
        String str6 = "e" + str.substring(1);
        String str7 = "hello";
        String str8 = "lo" + new String("hello");

        System.out.println(str == str1); // false
        System.out.println(str == str2); // false
        System.out.println(str == str3); // false
        System.out.println(str == str4); // false
        System.out.println(str == str5); // false
        System.out.println(str == str6); // false
        System.out.println(str == str7); // true
        System.out.println(str == str8); // false
        System.out.println(str.equals(str7)); // true
        System.out.println(str.equals(str8)); // false
    }
}
