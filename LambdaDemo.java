package Lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("猫叫");
            }
        };
        a.cry();

        //错误示范：Lambda并不是可以简化全部的匿名内部类，Lambda只能简化函数式接口的匿名内部类
//        Animal a1 -> {
//            System.out.println("Animal cry");
//        };
//        a1.cry();

        //Lambda 简化接口的匿名内部类
        Swim s1 = ()-> {
            System.out.println("学生打游戏贼六");
        };
        s1.swimming();

    }
}
abstract class Animal{
    public abstract void cry();
}
//函数式接口：只能有一个抽象方法的接口
@FunctionalInterface    //函数式接口的注解
interface  Swim{
    void swimming();
}