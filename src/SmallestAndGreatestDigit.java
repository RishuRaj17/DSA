import java.util.Scanner;

public class SmallestAndGreatestDigit {

    static int [] SmallestGreatest(int [] arr){
        int [] sg = {Integer.MIN_VALUE,Integer.MAX_VALUE};

        for(int i =0;i<arr.length;i++){
            if(arr[i]>sg[0]){
                sg[0] = arr[i];
            }

            if (arr[i]<sg[1]){
                sg[1] = arr[i];
            }
        }
        return sg;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i =0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int [] arr_1 = SmallestGreatest(arr);

        for(int j =0; j<arr_1.length;j++ ){
            System.out.print(arr_1[j]+" ");
        }
    }
}
