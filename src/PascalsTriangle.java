public class PascalsTriangle {

    static void pascalTiangle(int[][] arr,int val){
        arr[0][0] = val;
        for(int i =1;i<arr.length;i++){
            for(int j =0; j<=i; j++){
                if(j==0 || j==i){
                    arr[i][j] = arr[0][0];
                }else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
    }
    public static void main(String[] args) {
        int [][] pascal = new int[5][5];
        int val = 1;
        pascalTiangle(pascal,val);

        for(int [] key: pascal){
            for(int ans : key){
                if(ans==0){
                    System.out.print(" ");
                }
                else {
                    System.out.print(ans+" ");
                }
            }
            System.out.println();
        }
    }
}
