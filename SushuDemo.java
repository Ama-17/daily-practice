package Demo;

import java.util.EnumSet;

public class SushuDemo {
    public static void main(String[] args) {
        for (int i = 101;i <= 200;i++){
            if (test(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean test(int num){
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;

    }
}
