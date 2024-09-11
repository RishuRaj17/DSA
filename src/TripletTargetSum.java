import java.util.Scanner;

public class TripletTargetSum {

    static int tripletCount(int arr [], int target){

        int count= 0;
        for(int i =0; i< arr.length;i++){
            for(int j = i+1;j< arr.length;j++){
                for(int k = j+1;k< arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arr = {1,4,5,6,3};

        int target = sc.nextInt();

        System.out.println(tripletCount(arr,target));
    }
}
