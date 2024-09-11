import java.util.Scanner;

public class ArrayManipulation {

    static int uniqueValue(int [] arr){
        int ans=0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]==-1){
                continue;
            }
            else if(i== arr.length-1){
                ans = arr[i];
            }
            for(int j =i+1;j< arr.length;j++){

                if(arr[i]==arr[j]){

                    arr[j]=-1;
                    break;
                } else if (j==arr.length-1) {
                    ans = arr[i];
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,3,1,2};
        int [] arr_2 = {1,2,3,4,3,1,2,4,20};
        System.out.println(uniqueValue(arr));
        System.out.println(uniqueValue(arr_2));
    }
}
