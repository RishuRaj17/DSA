public class TwoPointerOddEven {

    static void sortArray(int arr[]){
        int left = 0;
        int right = arr.length-1;
        int temp;
        while(left<right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }

            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,12,3,4,8,9,33,24,4};

        sortArray(arr);

        for(int val: arr){
            System.out.print(val+ " ");
        }
    }
}
