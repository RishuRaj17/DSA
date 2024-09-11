import java.util.Scanner;

public class CheckIfSorted {
    static boolean ifSorted(int [] arr){
        boolean flag = false;

        for(int i =0;i< arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                flag = true;
            }
            else{
                return false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,8,4,5,6,7,7};

        System.out.println(ifSorted(arr));

    }
}
