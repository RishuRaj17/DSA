public class MatrixTranspose {
    static int [][] arr = {
            {1,2,3,0},
            {4,5,6,10},
            {7,8,9,20}
    };

    static int [][] arr2 = new int[4][3];

    static void matrixTranspose(){

            for(int j=0;j<arr.length;j++){
                for(int k =0;k< arr[0].length;k++){
                    arr2[k][j] = arr[j][k];
                }
            }
            
    }
    public static void main(String[] args) {
        matrixTranspose();

        for(int [] key: arr2){
            for(int val: key){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
