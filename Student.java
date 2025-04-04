package object;

public class Student {
    String name;
    double chinese;
    double math;

    public void A1(){
        System.out.println(name + "的总成绩是：" + (chinese+math));
    }
    public void A2(){
        System.out.println(name + "的平均成绩是：" + (chinese+math)/2);
    }

}
