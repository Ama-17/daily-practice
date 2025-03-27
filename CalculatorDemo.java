package CalculatorDemo;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        double a = sc.nextDouble();

        System.out.println("请输入符号(+、-、*、/)：");
        String n = sc.next();

        System.out.println("请输入第二个数字：");
        double b = sc.nextDouble();

        System.out.println("输出结果是："+sum(a, b, n));
    }

    public static double sum(double a, double b,String n) {
        double m = 0;
        switch (n){
            case "+":
                m = a+b;
                break;
            case "-":
                m = a-b;
                break;
            case "*":
                m =  a*b;
                break;
            case "/":
                if (b==0){
                    System.out.println("除数不能为0");
                    break;
                }else m =  a/b;
                break;
            default:
                return 0;
        }
        return m;
    }
}
