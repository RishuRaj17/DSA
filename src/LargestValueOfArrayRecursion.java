public class LargestValueOfArrayRecursion {

    static int largest =0;

    static int printLargest(int [] arr,int n){
        if(n==arr.length){
            return largest;
        }

        if(arr[n]>largest){
            largest = arr[n];
        }

        return printLargest(arr,n+1);
    }

    public static void main(String[] args) {
        int [] arr = {2,4,5,654,6,8,9,56,42,24,0,98,21,458};

        int ans = printLargest(arr,0);

        System.out.println(ans);
    }
}
