package object;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "波妞";
        s1.chinese = 100;
        s1.math = 100;
        s1.A1();
        s1.A2();

        Student s2 = new Student();
        s2.name = "波仔";
        s2.chinese = 59;
        s2.math = 100;
        s2.A1();
        s2.A2();
    }
}
