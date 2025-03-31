package itheima;

public class ArrayDemo3 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        String [] Array= new String[54];

        String [] A = {"黑桃","红桃","梅花","方块"};
        String [] B = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        int index = 0;
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j< B.length; j++){
                Array[index++] = A[i] + B[j];
            }
        }
        Array[index++] = "小王";
        Array[index] = "大王";

        System.out.println("洗好的新牌：");
        for (int i = 0; i < Array.length; i++){
            System.out.print(Array[i]+" ");
            if((i+1)%13==0){
                System.out.println();
            }
        }
        System.out.println();

        for (int i = 0; i < Array.length; i++){
            int index1 = (int)(Math.random()*Array.length);
            int index2 = (int)(Math.random()*Array.length);

            String temp = Array[index1];
            Array[index1] = Array[index2];
            Array[index2] = temp;
        }
        System.out.println("随机洗牌后：");
        for (int i = 0; i < Array.length; i++){
            System.out.print(Array[i]+" ");
            if((i+1)%13==0){
                System.out.println();
            }
        }

    }
}
