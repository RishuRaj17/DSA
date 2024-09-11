import java.util.Scanner;

public class KRotations {

    static int[] rotation(int [] arr, int k ){
        k %= arr.length;
        int temp = 0;
        for(int i = arr.length-1; i > ((arr.length-1)-k);i--){
            temp = arr[arr.length-1];
            for(int j = arr.length-1;j>0;j--){

                arr[j] = arr[j-1];

            }
            arr[0]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5};
        int k = sc.nextInt();

        rotation(arr,k);

        for(int value: arr){
            System.out.print(value+ " ");
        }

    }
}
