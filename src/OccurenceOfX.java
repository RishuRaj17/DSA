import java.util.Scanner;

public class OccurenceOfX {
    public static void main(String[] args) {
        int [] arr = {10,1,23,1,22,42,1,62,64};
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num = sc.nextInt();
        for(int i =0;i<arr.length;i++){
            if(arr[i]==num){
                count++;
            }
        }
        System.out.println(count);
    }
}
