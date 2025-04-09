package Demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //金卡
        GoldCard A = new GoldCard("桂AAAAAA","张三","11311141114",5000);
        pay(A);
        //银卡
        SilverCard B = new SilverCard("桂BBBBBB","李四","12312241224",2000);
        pay(B);
    }
    public static void pay(Card c){
        System.out.println("请刷卡");
        System.out.println("请输入金额");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);

    }
}
