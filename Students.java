package Students;

import object.Student;

public class Students {
    String  name;
    int age;
    char sex;

    public Students(){
        System.out.println("无参构造");
    }
    public Students(String a,int b,char c){
        name = a;
        age = b;
        sex = c;
        System.out.println("有参构造");
    }
}
