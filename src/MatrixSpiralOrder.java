public class MatrixSpiralOrder {

    static void spiralOrder(int [][] arr){
        int r = arr.length;
        int c = arr[0].length;
        int count = 0;
        int topRow=0;
        int bottomRow=r-1;
        int leftCol = 0;
        int rightCol = c-1;

        while (count<r*c){

//            Top Row
            for(int i = leftCol; i<=rightCol && count<r*c; i++){
                System.out.print(arr[topRow][i]+" ");
                count++;
            }
            topRow++;

//            Right Col
            for(int i=topRow;i<=bottomRow && count<r*c;i++){
                System.out.print(arr[i][rightCol]+" ");
                count++;
            }
            rightCol--;

//            Bottom Row
            for(int i = rightCol;i>=leftCol && count<r*c;i--){
                System.out.print(arr[bottomRow][i]+" ");
                count++;
            }
            bottomRow--;

//            Left Col
            for(int i=bottomRow;i<=topRow && count<r*c;i++){
                System.out.print(arr[i][leftCol]+" ");
                count++;
            }
            leftCol++;
        }
    }
    public static void main(String[] args) {
        int arr [][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        spiralOrder(arr);

    }
}
