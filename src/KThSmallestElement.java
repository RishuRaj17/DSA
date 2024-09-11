import java.util.Scanner;


public class KThSmallestElement {


//    static int[] KthSmallestAndLargest(int arr [], int k){
//
//        for(int i=0;i<arr.length;i++){
//
//        }
//        return arr ;
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int [] arr = {4,8,10,13,16,19,22,28};

        System.out.println("Kth Smallest Element: "+arr[k-1]);
        System.out.println("Kth Largest Element: "+arr[arr.length-k]);
    }
}
