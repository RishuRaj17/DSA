public class SubArrayDivision {

    static int arr [] = {5,3,2,6,3,1};
    static boolean flag = false;


    static int checkSubDivision(){

        for(int i =0;i<arr.length;i++){
            if(arr[i]==arr[arr.length-1]-arr[i]){
                flag = true;
                return i;
            }
        }
        return -1;
    }

    static void prefixSum(){
        for(int i =1;i<arr.length;i++){
            arr[i] = arr[i]+arr[i-1];
        }
    }

    public static void main(String[] args) {
        prefixSum();

        System.out.println(checkSubDivision());

    }
}

//5 8 10 16 19 20
//1,4,10,12,15,20