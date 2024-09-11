public class MaxElement {
    public static void main(String[] args) {
        int [] arr = {1,4,5,8,4,6,2,1};

        int max = 0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
