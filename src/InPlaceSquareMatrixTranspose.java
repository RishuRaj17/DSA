public class InPlaceSquareMatrixTranspose {

    static void transpose(int [][] arr){

        int temp;
        for(int i=0;i< arr.length;i++){
            for(int j=i;j< arr[0].length;j++){
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        transpose(matrix);

        for(int [] key: matrix){
            for(int val: key){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
