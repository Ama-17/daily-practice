package itheima;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args){
        ArrayTest();
    }
    public static void ArrayTest(){
        double [] A = new double[8];

        Scanner sc = new Scanner (System.in);

        for (int i = 0; i < A.length; i++) {
            System.out.println("请录入第"+(i+1)+"名同学的分数");
            A[i] = sc.nextDouble();
        }

        double sum = A[0];
        double max = A[0];
        double min = A[0];

        for (int i = 1; i < A.length; i++) {
            sum += A[i];

            double n = A[i];
            if (n > max){
                max = n;
            }

            if (n < min){
                min = n;
            }
        }
        System.out.println("总分是："+sum);
        System.out.println("平均分是："+sum/A.length);
        System.out.println("最高分是："+max);
        System.out.println("最低分是："+min);
    }
}
