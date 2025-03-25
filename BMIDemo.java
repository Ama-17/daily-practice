package BMIDemo;

import java.util.Scanner;

public class BMIDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请选择测试BMI还是BMR");
        System.out.println("1.BMI");
        System.out.println("2.BMR");
        double choice=sc.nextDouble();
        if (choice==1){
            double bmi=BMI(0,0);
            System.out.println(bmi);
            if (bmi<18.5){
                System.out.println("您的体质指数为：过轻");
            }else if (bmi<24.9){
                System.out.println("您的体质指数为：正常");
            }else if (bmi<29.9){
                System.out.println("您的体质指数为：过重");
            }else if (bmi<34.9){
                System.out.println("您的体质指数为：肥胖");
            }else if (bmi<39.9){
                System.out.println("您的体质指数为：严重肥胖");
           };
        }else if (choice==2){
            double bmr=BMR(0,0,0,(byte)0);
            System.out.println(bmr);
        }
    }

    public static double BMI(double weight, double height){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入身高(m）：");
        height=sc.nextDouble();
        System.out.println("请输入体重(kg)：");
        weight=sc.nextDouble();
        return weight / (height * height);
    }
    public static double BMR(double weight, double height, int age, byte gender){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入身高(m)：");
        height=sc.nextDouble();
        System.out.println("请输入体重(kg)：");
        weight=sc.nextDouble();
        System.out.println("请输入年龄(岁)：");
        age=sc.nextInt();
        System.out.println("请输入性别(男或女)：");
        System.out.println("1.男");
        System.out.println("2.女");
        gender=sc.nextByte();
        if (gender==1){
            return (13.7*weight+5*height-6.8*age+66);
        }else if (gender==2){
            return (9.6*weight+1.8*height-4.7*age+655);
        }
        else{
            System.out.println("输入错误");
        }
        return 0;
    }
}
