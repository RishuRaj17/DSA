public class PrefixSum2DArrayMethod03 {

    static void prefixSumRowXCol(int [][] arr){

        for(int i = 0; i<arr.length;i++){
            for(int j = 1;j<arr[0].length;j++){
                arr[i][j] = arr[i][j-1]+arr[i][j];
            }
        }

        for(int i=0;i< arr.length;i++){
            for(int j = 1;j< arr.length;j++){
                arr[j][i] = arr[j-1][i]+arr[j][i];
            }
        }
    }

    static int findMatrixPrefix(int [][] arr, int r1,int r2, int c1,int c2){

        int ans = 0;

        if(r1!=0 && c1!=0){
            ans = arr[r2][c2]-((arr[r2][c1-1])+(arr[r1-1][c2] - arr[r1-1][c1-1]));
        }
        else if (r1==0 && c1!=0){
            ans = arr[r2][c2] - arr[r2][c1-1];
        }
        else {
            ans = arr[r2][c2];
        }

        return ans;
    }

    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18},
                {19,20,21,22,23,24},
                {25,26,27,28,29,30},
                {31,32,33,34,35,36}
        };

        int [][]matrix2 = {
                {1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1}
        };

        prefixSumRowXCol(matrix2);

//        int prefix = findMatrixPrefix(matrix2,2,4,1,3);

//        int prefix = findMatrixPrefix(matrix2,0,1,1,3);

//        int prefix = findMatrixPrefix(matrix2,0,1,0,3);

        int prefix = findMatrixPrefix(matrix2,2,5,3,5);

        System.out.println(prefix);

        for(int [] key: matrix2){
            for(int val: key){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }

}
