import java.util.Scanner;

public class StrictlyGreater {

    static int strictlyGreaterCount(int []arr, int num){
        int count = 0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]>num){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr =  {10,1,23,1,22,42,1,62,64};
        int num = sc.nextInt();

        System.out.println( strictlyGreaterCount(arr,num) );
    }
}
