package Lambda;

import Innerclass.Student;
import Innerclass.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    public static void main(String[] args) {
        Test1();
        Test2();
    }
    public static void Test1(){
        Student[] students = new Student[6];
        students[0] = new Student("张三", 18,177,'男');
        students[1] = new Student("李四",  23,179,'女');
        students[2] = new Student("王五", 21,176,'男');
        students[3] = new Student("赵六", 22,183,'女');
        students[4] = new Student("孙七", 32,171,'男');
        students[5] = new Student("周八", 23,172,'女');

        // 排序,可以直接调用sun公司写好的API直接对数组进行排序
        //用Lambda表达式
//        Arrays.sort(students,(Student o1, Student o2) -> {
//            return o1.getAge() - o2.getAge();   //按年龄升序
//        });
//        for(int i = 0; i < students.length; i++){
//            Student s = students[i];
//            System.out.println(s);
//        }
        //用Lambda表达式简化
        Arrays.sort(students,(o1,o2) -> o1.getAge() - o2.getAge() );
        for(int i = 0; i < students.length; i++){
            Student s = students[i];
            System.out.println(s);
        }
    }

    public static void Test2(){
        JFrame win = new JFrame("登录窗口");
        win.setSize(300, 200);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        panel.add(btn);

//        btn.addActionListener((ActionEvent e) -> {
//            System.out.println("登录成功");
//        });
        // 用Lambda表达式简化
        btn.addActionListener(e -> System.out.println("登录成功") );
        win.setVisible(true);
    }
}

