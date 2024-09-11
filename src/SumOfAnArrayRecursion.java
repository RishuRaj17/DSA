public class SumOfAnArrayRecursion {

    static int sum =0;
    static void arraySum(int [] arr,int n){
        if(n==arr.length){
            return;
        }

        sum+= arr[n];

        arraySum(arr,n+1);
    }

    public static void main(String[] args) {
        int [] arr = {2,4,1,5,3};

        arraySum(arr,0);

        System.out.println(sum);
    }
}
