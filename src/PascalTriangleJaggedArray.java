public class PascalTriangleJaggedArray {
    static int [][] pascalJaggedTriangle(){
        int [][] arr = new int[5][];

        for(int i =0;i< arr.length;i++){
            arr[i] = new int[i+1];

            arr[i][0] = arr[i][i] = 1;

            for(int j =1;j<i;j++){
                arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
            }

        }
        return arr;
    }
    public static void main(String[] args) {

        int [][] pascal = pascalJaggedTriangle();

        for(int [] key: pascal){
            for(int val: key){
                System.out.print(val+" ");
            }
            System.out.println();
        }

    }
}
