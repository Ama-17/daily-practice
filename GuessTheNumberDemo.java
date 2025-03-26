package GuessTheNumberDemo;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberDemo {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Random r = new Random();
        int num = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("请猜测一个1~100的数");

        while (true){
            int i = sc.nextInt();

            if (i == num){
                System.out.println("恭喜你猜对了");
                break;
            }else if (i > num){
                System.out.println("猜大了");
            }else {
                System.out.println("猜小了");
            }
        }
    }
}
