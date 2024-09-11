import java.util.Scanner;

public class PrintValuesOfArrayRecursion {

    static int printArr(int [] arr, int n){

        if(n==0){
            return n;
        }

        System.out.print(arr[printArr(arr,n-1)]+" ");
        return n;

    }

    static void printPWArr(int [] arr, int n){

        if(n==arr.length){
            return;
        }

        System.out.print(arr[n]+" ");

        printPWArr(arr,n+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {2,4,5,6,8,7,3,2};

        printArr(arr,8);
        System.out.println();
        printPWArr(arr,0);
    }
}
