public class SufixSum {

    static void sufixSum(int arr []){

        for(int i= arr.length-2;i>=0;i--){
            arr[i] = arr[i+1]+arr[i];
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,1,3,4,5};

        sufixSum(arr);

        for(int val: arr){
            System.out.print(val+" ");
        }

    }
}
