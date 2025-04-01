package itheima;

public class ArrayDemo5 {
    public static void main(String[] args) {
        test(4,4);

    }
    public static int test(int n,int m) {
        int[][] A = new int[n][m];
        int temp = 1;

        //初始化遍历
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                A[i][j] = temp++;
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();

        //打乱遍历
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[i].length; j++){

                int a = (int)(Math.random()*A.length);
                int b = (int)(Math.random()*A[a].length);

                int temp1 = A[i][j];
                A[i][j] = A[a][b];
                A[a][b] = temp1;
            }
        }
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[i].length; j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        return temp;
    }
}
