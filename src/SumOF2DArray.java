public class SumOF2DArray {

    static int [][] sumOf2DArray(int[][]matrix1,int [][] matrix2){

        int [][] arr = new int[2][2];
        for(int i = 0;i<matrix1.length;i++){
            for(int j = 0;j<matrix1[i].length;j++){
                arr[i][j]= matrix1[i][j] + matrix2[i][j];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [][] matrix1 = {{2,3},{4,5}};
        int [][] matrix2 = {{1,2},{3,4}};


        int [][] arr = sumOf2DArray(matrix1,matrix2);

        for(int [] key: arr){
            for(int val: key){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
