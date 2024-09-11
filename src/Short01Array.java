public class Short01Array {


    static int [] sort01Array(int[] arr){

        int j = arr.length;
        int count = 0;

        for(int i =0;i<j;i++){
            if(arr[--j]==0 && i!=j){
                count++;
            }
            if (arr[i]==0) {
                count++;
            }
        }

        for(int i=0;i< arr.length;i++){
            if(count>0){
                arr[i]=0;
                count--;
            }
            else{
                arr[i]=1;
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
