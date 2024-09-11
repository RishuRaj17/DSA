import java.util.Scanner;

public class LastOccurenceOfX {

    static int lastOccurence(int[] arr, int num){

        int index=-1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==num){
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {10,1,23,1,22,42,1,62,64};
        int num = sc.nextInt();

        System.out.println(lastOccurence(arr,num));
    }
}
