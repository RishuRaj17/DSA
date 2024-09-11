public class SumOfAnArrayRecursion02 {

    static int arraySum(int [] arr, int n){
        if(n==arr.length){
            return 0;
        }

        return arr[n]+arraySum(arr,n+1);
    }


    public static void main(String[] args) {
        int [] arr = {2,4,1,5,3,5};

        System.out.println(arraySum(arr,0));
    }
}
