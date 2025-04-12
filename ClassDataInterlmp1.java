package InterfaceDemo;

public class ClassDataInterlmp1 implements ClassDataInter{
    private StudentInterface[] studentInterfaces;
    public ClassDataInterlmp1(StudentInterface[] studentInterfaces) {
        this.studentInterfaces = studentInterfaces;
    }
    @Override
    public void printAllStudentInfos() {
        System.out.println("学生信息如下：");
        for(int i = 0; i< studentInterfaces.length; i++){
            StudentInterface s = studentInterfaces[i];
            System.out.println(s.getName()+" "+s.getSex()+" "+s.getScore());
        }
    }

    @Override
    public void printAverageScore() {
        double sum = 0;
        for (int i = 0; i < studentInterfaces.length; i++){
            StudentInterface s = studentInterfaces[i];
            sum += s.getScore();
        }
        System.out.println("平均成绩为："+(sum/ studentInterfaces.length));
    }

}
