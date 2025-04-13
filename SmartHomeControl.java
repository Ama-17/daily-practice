package Demo;

public class SmartHomeControl {
    public void control(JD jd) {
        jd.press();
        System.out.println(jd.getName()+"状态已经是：\t"+(jd.isStatus()?"开着":"关闭"));
    }

    public void control(JD[] jds) {
        System.out.println("当前设备状态是：");
        for(int i = 0; i < jds.length; i++){
            System.out.println((i+1)+jds[i].getName()+"状态目前是：\t"+(jds[i].isStatus()?"开着":"关闭"));
        }
    }
}
