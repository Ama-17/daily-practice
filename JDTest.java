package Demo;

import java.util.Scanner;

public class JDTest {
    public static void main(String[] args) {
        JD[] jds = new JD[]{
                new Lamp("公牛灯泡",true),
                new WashMachine("美的洗衣机",false),
                new TV("小米电视",true),
                new Air("美的空调",false)
        };

        SmartHomeControl smartHomeControl = new SmartHomeControl();
        while (true) {
            smartHomeControl.control(jds);
            System.out.println("请您选择要控制的设备：");
            Scanner scanner = new Scanner(System.in);
            String index = scanner.next();
            switch (index) {
                case "1":
                    smartHomeControl.control(jds[0]);
                    break;
                case "2":
                    smartHomeControl.control(jds[1]);
                    break;
                case "3":
                    smartHomeControl.control(jds[2]);
                    break;
                case "4":
                    smartHomeControl.control(jds[3]);
                    break;
                case "exit":
                    System.out.println("退出App");
                    return;
                default:
                    System.out.println("您输入有误，请重新输入");
            }
        }
    }
}
