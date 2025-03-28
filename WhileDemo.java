package loop;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入本金");
        double money = sc.nextDouble();
        System.out.println("请输入利率");
        double rate = sc.nextDouble();
        System.out.println("请输入目标金额");
        double QiWang = sc.nextDouble();
        System.out.println("需要" + test(money, rate, QiWang) + "年");
    }

    public static int test(double money, double rate,double QiWang) {
//        double money = 100000;
//        double rate = 0.017;
        int year = 0;
        while(money< QiWang){
            money += money * rate;
            year++;
        }
        return year;
    }
}
