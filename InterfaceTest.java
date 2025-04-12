package InterfaceDemo;

public class InterfaceTest {
    public static void main(String[] args) {
        StudentInterface[] allStudentInterface = new StudentInterface[]{
                new StudentInterface("张三",'男',87),
                new StudentInterface("李四",'男',90),
                new StudentInterface("王五",'男',83),
                new StudentInterface("赵六",'女',97),
                new StudentInterface("孙七",'女',81),
                new StudentInterface("周八",'女',84),
                new StudentInterface("吴九",'男',96),
                new StudentInterface("郑十",'男',78),
        };
        ClassDataInter cdi = new ClassDataInterlmp2(allStudentInterface);
        cdi.printAllStudentInfos();
        cdi.printAverageScore();
    }
}
