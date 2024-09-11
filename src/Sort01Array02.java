public class Sort01Array02 {

    static int[] sort01Array(int [] arr){

        int temp;
        int left=0;
        int right=arr.length-1;
        while (left<right){
            if(arr[left]==1 && arr[right]==0){
                temp = arr[left];
                arr[left]= arr[right];
                arr[right]= temp;

                left++;
                right--;
            }

            if(arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {0,1,1,0,0,0,1,0,1,0,1};

        sort01Array(arr);

        for(int val: arr){
            System.out.print(val+" ");
        }
    }
}
