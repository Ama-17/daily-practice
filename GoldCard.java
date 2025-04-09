package Demo;

public class GoldCard extends Card{
    public GoldCard(String carid, String name, String phone, int money) {
        super(carid, name, phone, money);
    }
    @Override
    public void consume(double money){
        System.out.println("您当前的消费金额为："+money);
        System.out.println("优惠后的消费金额为："+money*0.8);
        //判断余额
        if (getMoney()<money*0.8){
            System.out.println("您的余额不足，请充值");
            return;
        }
        //更新余额
        setMoney(getMoney()-money*0.8);
        //判断洗车票
        if (money*0.8 >= 200){
            printTicket();
        }else {
            System.out.println("您消费不足200，不提供洗车票");
        }

    }
    public void printTicket(){
        System.out.println("您消费满200，打印洗车票");
    }
}
