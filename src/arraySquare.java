public class arraySquare {


    static int[] swapReverse(int[]arr){
        int left = 0;
        int right = arr.length-1;
        int temp = 0;
        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        return arr;
    }

    static int[] squareSort(int[]arr){

        int left = 0;
        int right = arr.length-1;
        int [] temp = new int[arr.length];
        int index = 0;

        while(left<=right){

                if(Math.abs(arr[left])>=Math.abs(arr[right])){
                    temp[index++]=arr[left]*arr[left];
                    left++;
                }
                else{
                    temp[index++]=arr[right]*arr[right];
                    right--;
                }
        }

        swapReverse(temp);
        return temp;
    }

    public static void main(String[] args) {
        int arr [] = {-10,-3,-2,2,1,4,5};


        int [] temp = squareSort(arr);
        for(int val: temp){
            System.out.print(val+" ");
        }
    }
}
