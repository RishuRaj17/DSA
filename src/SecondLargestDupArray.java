public class SecondLargestDupArray {

    static int [] killLargest(int [] arr, int largest){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==largest){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return arr;
    }

    static int Largest(int [] arr){

        int largest =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int [] arr = {9,8,9,6,9,5,8};
        int [] arr_2 = {0,-2,0,-3,0,-4};

        System.out.println(Largest(killLargest(arr,Largest(arr))));
        System.out.println(Largest(killLargest(arr_2,Largest(arr_2))));
    }
}
