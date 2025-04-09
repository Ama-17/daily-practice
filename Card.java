package Demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String carid;
    private String name;
    private String phone;
    private double money;

    //预存
    public void deposit(double money){
        this.money+=money;
    }
    //消费
    public void pay(double money){
        this.money-=money;
    }

    public void consume(double money) {}

}
