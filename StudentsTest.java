package Students;

import object.Student;

public class StudentsTest {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "张三";
        s1.age = 18;
        s1.sex = '男';

        Students s2 = new Students("李四",19,'女');
    }
}
