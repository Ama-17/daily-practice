package Demo;

public class SilverCard extends Card{
    public SilverCard(String carid, String name, String phone, int money) {
        super(carid, name, phone, money);
    }

    @Override
    public void consume(double money){
        System.out.println("您当前的消费金额为："+money);
        System.out.println("优惠后的消费金额为："+money*0.9);
        if (getMoney()<money*0.8){
            System.out.println("您的余额不足，请充值");
            return;
        }
        setMoney(getMoney()-money*0.9);
    }
}
