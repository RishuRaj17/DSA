import java.util.Scanner;

public class NxNSpiralOrderMatrix {

    static int [][] spiralMatrix(int n){

        int [][] arr = new int[n][n];
        int count = 1;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;

        while(count<=n*n){

//            Top row
            for(int i=left; i<=right && count<=n*n;i++){
                arr[top][i] = count++;
            }
            top++;

//            Right Col
            for(int i =top; i<=bottom && count<=n*n;i++){
                arr[i][right] = count++;
            }
            right--;

//            Bottom Col
            for(int i=right; i>=left && count<=n*n;i--){
                arr[bottom][i] = count++;
            }
            bottom--;

//            Left Col
            for(int i =bottom; i>=top && count<=n*n;i--){
                arr[i][left] = count++;
            }
            left++;
        }


        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int love [][] = spiralMatrix(n);

        for(int [] key: love){
            for(int val: key){
                System.out.print(val+" ");
            }
            System.out.println();
        }

    }
}
