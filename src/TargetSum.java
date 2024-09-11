import java.util.Scanner;

public class TargetSum {

    static boolean flag = false;

    static int findFrequency(int [] arr,int target){

        int count=0;
        for(int i =0;i< arr.length;i++){
            for(int j =i+1;j< arr.length;j++){
                if(arr[i]+arr[j] == target){
                    count++;
                }
            }
        }
        if(count>0){
            flag = true;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {4,6,3,5,8,2};
        int target = sc.nextInt();

        int pairs =  findFrequency(arr,target);

        if(flag){
            System.out.println("Target Hit!\ntotal pairs: "+pairs);
        }
        else{
            System.out.println("Target missed!");
        }
    }
}
