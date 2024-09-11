import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int arr [] = {12,23,11,2,4,56,10,14,2,11};
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean flag = false;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println(i);
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println(-1);
        }
    }
}
