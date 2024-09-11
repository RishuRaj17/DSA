public class Transpose90Degree {

    static   void transpose90Degree(int [][]arr){
        int temp;

        int right = arr.length-1;
        int left = 0;

        for(int i =0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            while (left<right){
                temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
            left = 0;
            right = arr.length-1;

        }
    }
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int [][]matrix2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        transpose90Degree(matrix2);

        for(int [] key: matrix2){
            for(int val: key){
                System.out.print(val+ " ");
            }
            System.out.println();
        }

    }
}
