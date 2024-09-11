import java.util.Scanner;

public class MatrixMultiplication {

    static Scanner sc = new Scanner(System.in);
    static int row;
    static int col;
    static int count =1;

    static int [][] matrix1;
    static int [][] matrix2;

    static int arr [][];

    static boolean flag = true;

    static void matrixMultiply(){

        if(matrix1[0].length!=matrix2.length){
            System.out.println("Invalid Matrix Size!");
            flag = false;
            return;
        }


        int ans = 0;

        arr = new int[matrix1.length][matrix2[0].length];
        for(int k =0;k<arr.length;k++) {
            for (int i = 0; i <matrix2[0].length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    arr[k][i] += matrix1[k][j] * matrix2[j][i];
                }
            }

        }
    }

    static void matrixInput(int[][]arr,int row,int col){

        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        count++;
    }

    public static void main(String[] args) {

        System.out.println("Enter "+count+"st Matrix Rows and Column number: ");

        row = sc.nextInt();
        col = sc.nextInt();
        matrix1 = new int[row][col];
        matrixInput(matrix1,row,col);

        System.out.println("Enter "+count+"st Matrix Rows and Column number: ");

        row = sc.nextInt();
        col = sc.nextInt();
        matrix2 = new int[row][col];
        matrixInput(matrix2,row,col);

        matrixMultiply();

        if(flag){
            for(int [] key: arr){
                for(int val: key){
                    System.out.print(val+" ");
                }
                System.out.println();
            }
        }
    }
}
