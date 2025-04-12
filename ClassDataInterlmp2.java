package InterfaceDemo;

public class ClassDataInterlmp2 implements ClassDataInter{
    private StudentInterface[] studentInterfaces;
    public ClassDataInterlmp2(StudentInterface[] studentInterfaces)
    {
        this.studentInterfaces = studentInterfaces;
    }
    @Override
    public void printAllStudentInfos() {
        int maleCount = 0;
        for (int i = 0; i< studentInterfaces.length; i++){
            StudentInterface s = studentInterfaces[i];
            System.out.println(s.getName()+" "+s.getSex()+" "+s.getScore());
            if(s.getSex()=='男'){
                maleCount++;
            }
        }
        System.out.println("男学生人数为："+maleCount);
        System.out.println("女学生人数为："+(studentInterfaces.length-maleCount));
    }

    @Override
    public void printAverageScore() {
        StudentInterface s1 = studentInterfaces[0];
        double sum = s1.getScore();
        double max = s1.getScore();
        double min = s1.getScore();

        for (int i = 1; i < studentInterfaces.length; i++){
            StudentInterface s = studentInterfaces[i];
            sum += s.getScore();

            if (s.getScore()>max){
                max = s.getScore();
            }
            if (s.getScore()<min){
                min = s.getScore();
            }
        }
        System.out.println("最高分："+max);
        System.out.println("最低分："+min);
        System.out.println("平均成绩为："+((sum-max-min)/(studentInterfaces.length-2)));
    }
}
