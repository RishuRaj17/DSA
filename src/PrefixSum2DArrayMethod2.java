public class PrefixSum2DArrayMethod2 {

    static void findPrefixSum(int[][]arr){

        int temp=0;

        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                arr[i][j] = arr[i][j-1]+arr[i][j];
            }
        }
    }

    static int prefixSum(int [][]arr,int r1,int r2,int c1,int c2){

        int ans = 0;

        for(int i = r1;i<=r2;i++){
            if(c1==0){
                ans+= arr[i][c2];
            }else {
                ans+= arr[i][c2]-arr[i][c1-1];
            }
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

        findPrefixSum(matrix);

        int prefix = prefixSum(matrix,0,2,0,3);

        System.out.println(prefix);

    }
}
